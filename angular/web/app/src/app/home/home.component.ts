import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  productList:any = [];
  constructor(private common:CommonService) { 
    this.productList = this.common.getProductList();
  }

  ngOnInit(): void {
  }

}
