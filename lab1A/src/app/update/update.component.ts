import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { IGPU } from '../interfaces/gpu';

import { UserService } from '../services/user.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.scss']
})
export class UpdateComponent implements OnInit {

  @Input() user?:IGPU
  @Output() updated:EventEmitter<null>= new EventEmitter();
  constructor(private service:UserService) { }

  ngOnInit(): void {
  }

  updateUser(){
    if(this.user) {
      console.log(this.user);
      this.service.putUser(this.user).subscribe(
      ()=>{
        this.updated.emit();        
      }
    );}

  }


}
