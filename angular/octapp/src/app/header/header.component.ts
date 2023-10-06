import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Input() fromParent ="";//variable wch helps us to get the value from the parent. 
  constructor() { }

  ngOnInit(): void {
  }

}
