import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.sass']
})
export class MenuComponent implements OnInit {

  constructor() { }

  memKlas: string=""

    public displaiStan(): void{

      if(this.memKlas==""){
        this.memKlas="NONE"
        console.log("string Visibl");
        }
      else{
        this.memKlas=""
        console.log("string NONE");
      }

  }

  ngOnInit(): void {
  }

}
