import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-list-books',
  templateUrl: './list-books.component.html',
  styleUrls: ['./list-books.component.css']
})
export class ListBooksComponent implements OnInit {

  books: any[]

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/books')
      .subscribe((data: any[]) => {
        this.books = data;
      });
  }
}
