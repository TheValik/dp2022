import { Component } from '@angular/core';
import { IGPU } from './interfaces/gpu';
import { Service1Service } from './services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'lab1A';
  entityList:IGPU[]=[];

  constructor(private service:Service1Service){}

  
  ngOnInit():void{
    this.updateGPUs();
  }

updateGPUs():void{
  //getEnt
    this.service.getEntities().subscribe(
      (gpu)=>{
        this.entityList=gpu;
      }
      )
  }

  addEntities(gpu:IGPU):void{
    //postEntities
    this.service.putEntities(gpu).subscribe(
      (gpu)=>{
        console.log(gpu);
        this.updateGPUs();
      }
      )
  }
  

}
