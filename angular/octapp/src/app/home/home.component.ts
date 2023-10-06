import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

   userList:any = [];
   name = "";
   job = "";
   pageNo="";
   userCreateResponse  = "";
  constructor(private activeRouter:ActivatedRoute, private httpObj:HttpClient,private common:CommonService ) {
    this.activeRouter.queryParams.subscribe(queryList=>{
      console.log(queryList);//to read the value from the url
      //can use variable to assign the value from the url
    })
   }

  ngOnInit(): void {
  }
  pageSelection(){
      this.getDataFromServer(this.pageNo);
  }

  getDataFromServer(pageNo ="1"){
    this.httpObj.get("https://reqres.in/api/users?page="+pageNo).subscribe((response:any)=>{
      console.log(response);//print the response in the console.
      this.userList  = response['data'];
    })
  }
  createUser(){
    if(this.name == ""){
      //show alert as 'name should not be empty';
      this.common.showAlert("Name Should not be empty!!!");
    }else if(this.job == ""){
      //show alert as 'name should not be empty';
      this.common.showAlert("Job Should not be empty!!!");
    }
    let param = {
      "name": this.name,
      "job": this.job
    }
   
    this.httpObj.post("https://reqres.in/api/users",param).subscribe(
      (response:any)=>{
      console.log(response);//print the response in the console.
      this.userCreateResponse = "User is created.His ID is "+response['id'];
    })
  }
  errorLogin(){
    
    let param = {
      "email": "sampeerro@gmail.com"
    }
    //content-type:application/json
   let header = new HttpHeaders().set("token","sample token value");
    this.httpObj.post("https://reqres.in/api/login",param,{headers:header}).subscribe(
      (response:any)=>{
      console.log(response);//print the response in the console.
    },(error)=>{
      console.log("error",error['error']);
      alert("error while calling this api");
    });
  }

}
