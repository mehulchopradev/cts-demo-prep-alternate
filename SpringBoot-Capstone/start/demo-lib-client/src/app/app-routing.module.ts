import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddBooksComponent } from './add-books/add-books.component';
import { ListBooksComponent } from './list-books/list-books.component';


const routes: Routes = [
  {path: 'add', component: AddBooksComponent},
  {path: 'list', component: ListBooksComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
