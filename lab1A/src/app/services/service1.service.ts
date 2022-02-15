import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IGPU } from '../interfaces/gpu';
@Injectable({
  providedIn: 'root'
})
export class Service1Service {
url:string="http://localhost:8080/lab1/Servlet1"
  constructor(private http:HttpClient) { }

  getEntities():Observable<IGPU[]>{
    return this.http.get<IGPU[]>(this.url)
  }

  postEntities(gpu:IGPU):Observable<IGPU[]>{
    return this.http.post<IGPU[]>(this.url,gpu)
  }
  putEntities(gpu:IGPU):Observable<IGPU[]>{
    return this.http.put<IGPU[]>(this.url,gpu)
  }

}
