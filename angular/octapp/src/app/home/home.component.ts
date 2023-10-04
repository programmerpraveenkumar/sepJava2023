import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

   userList:any = [];
   name = "";
   job = "";
  constructor(private httpObj:HttpClient,private common:CommonService) { }

  ngOnInit(): void {
  }

  getDataFromServer(){
    this.httpObj.get("https://reqres.in/api/users?page=2").subscribe((response:any)=>{
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
    this.httpObj.post("https://reqres.in/api/users",param).subscribe((response:any)=>{
      console.log(response);//print the response in the console.
    })
  }

}
