import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forma-vzaemidii',
  templateUrl: './forma-vzaemidii.component.html',
  styleUrls: ['./forma-vzaemidii.component.sass']
})
export class FormaVzaemidiiComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  perem: string ="NO"
  inputName: string=""
  inputEmail: string=""
  inputText: string=""
  onSubmit() {
    this.inputName = (<HTMLInputElement>document.getElementById("NameID")).value;
    this.inputEmail = (<HTMLInputElement>document.getElementById("EmailID")).value;
    this.inputText = (<HTMLInputElement>document.getElementById("TextID")).value;
    console.log(this.inputName)
    console.log(this.inputEmail)
    console.log(this.inputText)
    this.perem=""
  }

}

