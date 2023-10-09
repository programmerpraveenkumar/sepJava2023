import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})
export class ShopComponent implements OnInit {

 productList:any = [];
  constructor(private common:CommonService) { 
    this.productList = this.common.getProductList();
  }

  ngOnInit(): void {
  }

}
