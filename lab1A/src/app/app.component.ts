import { Component } from '@angular/core';
import { GPU } from './interfaces/gpu';
import { Service1Service } from './services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'lab1A';
  entityList:GPU[]=[];

  constructor(private service:Service1Service){}

  getEntities():void{
    this.service.getEntities().subscribe(
      (gpu)=>{
        this.entityList=gpu;
      }
      )
  }
}
