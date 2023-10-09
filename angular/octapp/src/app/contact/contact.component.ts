import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  constructor(private httpClient:HttpClient) { }
  pageName ="this is contact component";
  currentDate = new Date();//current date
  price = 50;
  num =10;
  userList:any  = [];
  name ='';
  email ='';
  selectUserId = '';

  ngOnInit(): void {
  }
  recvParent(event:any){
      console.log(event);//from child to parent
  }
  getUserList(){
    this.httpClient.get("http://localhost:8080/getUserList").subscribe((res:any)=>{
      console.log(res);
      this.userList = res;
    })
  }
  update(userObj:any){
    this.name = userObj.name;
    this.email = userObj.email;
    this.selectUserId = userObj.id;//assign the user id for update.    
  }

  updateUser(){
    let params = {
      "name":this.name,
      "email":this.email,
      "id":this.selectUserId
    }
    this.httpClient.put("http://localhost:8080/update",params).subscribe((res:any)=>{
      console.log(res);
      this.selectUserId ="";//clear the id.
    })
  }

  deleteUser(userId:any){    
    if(!confirm("are you sure want to delete.?")){
      return;
    }
    this.httpClient.delete("http://localhost:8080/delete/"+userId).subscribe((res:any)=>{
        alert("User is deleted..");
        this.getUserList();//list of the users
    })
  }
  createUser(){
    if(this.selectUserId != ""){
      this.updateUser();//when user is not empty..will go update.      
    }else{
      let params = {
        "name":this.name,
        "email":this.email
      }
      this.httpClient.post("http://localhost:8080/createUser",params).subscribe((res:any)=>{
        console.log(res);
        this.userList = res;
        this.getUserList();//list of the users
      })
    }
    
  }
}
