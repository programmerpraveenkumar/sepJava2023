import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email ='';
  password = '';
  message = '';
  constructor(private httpclient:HttpClient) { } 

  ngOnInit(): void {
  }
  add(a:number,b:number){
      return a+b;
  }

  login_validate(){
    this.message = '';
    let params = {
      "email":this.email,
      "password":this.password
    }
    this.httpclient.post("http://localhost:8080/login",params).subscribe((res:any)=>{
        
    },err=>{
      
      this.message = err['error']['message'];
    })
  }

}
