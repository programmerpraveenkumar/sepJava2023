import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonService {
  productList = [
    {"name":"Ring","price":"200","image":"p1.png"},
    {"name":"watch","price":"300","image":"p2.png"},
    {"name":"teddy bear","price":"400","image":"p3.png"},
    {"name":"Red bouqet","price":"500","image":"p4.png"},
    {"name":"Ring","price":"900","image":"p1.png"},
    {"name":"teddy bear","price":"2200","image":"p3.png"},
    {"name":"watch","price":"100","image":"p2.png"},
    {"name":"Ring","price":"200","image":"p1.png"},
  ];
getProductList(){
  return this.productList;
}
} 
