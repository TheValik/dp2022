import { Component, OnInit } from '@angular/core';
import { IGPU } from '../interfaces/gpu';
import { UserService } from '../services/user.service';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  title:string="List of GPU`s";
  usersList:IGPU[]=[];
  showAddForm:boolean=false;
  selectedUser?:IGPU;


  constructor(private service:UserService) { }

  ngOnInit(): void {
    this.updateUsers();
  }

  updateUsers(){
    this.service.getUsers().subscribe(
      (rest1)=>{
        this.usersList=rest1._embedded.gPUs;
        //this.service.setList(items);
      }
      
    );
  }

   addUser(user:IGPU){
    this.service.postUser(user).subscribe(
      (user)=>{
        // console.log(user);
        this.updateUsers();
      }
    );
   }

   onSelect(user:IGPU){
    console.log(user);
    if(this.selectedUser && user._links==this.selectedUser._links){
      this.selectedUser=undefined;
    } else {
      this.selectedUser=user;
    }
   }

   deleteUser(user:IGPU){
    this.service.deleteUser(user).subscribe(
      ()=>{
        this.updateUsers();
      }
    );
   }

}
