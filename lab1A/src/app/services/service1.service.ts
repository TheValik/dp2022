import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { GPU } from '../interfaces/gpu';
@Injectable({
  providedIn: 'root'
})
export class Service1Service {
url:string="http://localhost:8080/lab1/Servlet1"
  constructor(private http:HttpClient) { }

  getEntities():Observable<GPU[]>{
    return this.http.get<GPU[]>(this.url)
  }
}
