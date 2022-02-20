import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { IGPU } from '../interfaces/gpu';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  list = new BehaviorSubject<IGPU[]>([])
  // url:string="http://localhost:3000/users"
  url:string="http://localhost:8080/users/Servlet1"
  // USERS:IUser[]=[{id:1,name:"Roman", age:49},{id:2,name:"Olena", age:29}]

  constructor(private http:HttpClient) { }

  getUsers():Observable<IGPU[]>{
    return this.http.get<IGPU[]>(this.url);
  }

  postUser(user:IGPU):Observable<IGPU[]>{
    return this.http.post<IGPU[]>(this.url,user);
  }

  putUser(user:IGPU):Observable<IGPU[]>{
    return this.http.put<IGPU[]>(this.url+"/"+user.id,user);
  }

  deleteUser(user:IGPU):Observable<IGPU[]>{
    return this.http.delete<IGPU[]>(this.url+"/"+user.id);
  }

  setList(list:IGPU[]){
    this.list.next(list);
  }


}
