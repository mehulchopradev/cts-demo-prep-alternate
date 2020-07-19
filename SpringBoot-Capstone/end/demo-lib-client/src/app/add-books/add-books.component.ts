import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {

  title: string;
  price: number;
  pages: number;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  addBook() {
    const { title, price, pages } = this;
    this.http.post('http://localhost:8080/books', {
      title,
      price,
      pages
    }).subscribe((data) => {
      this.title = null;
      this.price = null;
      this.pages = null;
    });
  }

}
