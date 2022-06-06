import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { IGPU } from '../interfaces/gpu';
import { Rest1 } from '../interfaces/rest1';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  list = new BehaviorSubject<IGPU[]>([])

  url:string="http://localhost:1155/gPUs"


  constructor(private http:HttpClient) { }

  getUsers():Observable<Rest1>{
    return this.http.get<Rest1>(this.url);
  }

   postUser(user:IGPU):Observable<IGPU[]>{
     return this.http.post<IGPU[]>(this.url,user);
   }

   putUser(user:IGPU):Observable<IGPU[]>{
     return this.http.put<IGPU[]>(this.url+"/"+user._links,user);
   }

   deleteUser(user:IGPU):Observable<IGPU[]>{
     return this.http.delete<IGPU[]>(user._links.self.href);
   }

   setList(list:IGPU[]){
     this.list.next(list);
   }


}


// putUser(user:IGPU):Observable<IGPU[]>{
//   return this.http.put<IGPU[]>(this.url+"/"+user.id,user);
// }

// deleteUser(user:IGPU):Observable<IGPU[]>{
//   return this.http.delete<IGPU[]>(this.url+"/"+user.id);
// }