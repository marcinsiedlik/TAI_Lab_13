import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-blog-home',
  templateUrl: './blog-home.component.html',
  styleUrls: ['./blog-home.component.css']
})
export class BlogHomeComponent implements OnInit {

  filterText: string;

  constructor() {
  }

  ngOnInit(): void {
  }

  getName($event) {
    this.filterText = $event;
  }

}
