import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'octapp';
  personName ="sample name";
  address = "sampel address ,sample city"
  mobile = "454545";
  showMessage(){
    alert("this is angular onclick method");
  }
}
