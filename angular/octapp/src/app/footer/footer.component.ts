import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  @Output() toParent = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }

  publishMessage(){
    this.toParent.next("from footer to parent component");
  }
}
