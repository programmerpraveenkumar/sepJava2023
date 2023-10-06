import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  constructor() { }
  pageName ="this is contact component";
  currentDate = new Date();//current date
  price = 50;
  num =10;

  ngOnInit(): void {
  }
  recvParent(event:any){
      console.log(event);//from child to parent
  }
}
