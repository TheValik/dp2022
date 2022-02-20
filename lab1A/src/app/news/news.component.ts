import { Component, OnInit } from '@angular/core';
import { NewsInterface } from '../news-interface';
import { NewsService } from '../news.service';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.sass']
})
export class NewsComponent implements OnInit {

  constructor(private service:NewsService) { 
  }
  NewsList: NewsInterface[]=[];
  ngOnInit(): void {
    this.ToSubscribe();
  }

  public ToSubscribe(): NewsInterface[]{
    this.service.getNews().subscribe(
    (NEWS)=>{
      console.log(NEWS);
      this.NewsList = NEWS;
    }
    );
    return (this.NewsList);
    
  }

  dodinfa1: string="NONE"
  public DodText1(){
    if(this.dodinfa1==""){
      this.dodinfa1="NONE"
    }
    else{
      this.dodinfa1=""
    }
  }

  dodinfa2: string="NONE"
  public DodText2(){
    if(this.dodinfa2==""){
      this.dodinfa2="NONE"
    }
    else{
      this.dodinfa2=""
    }
  }

  dodinfa3: string="NONE"
  public DodText3(){
    if(this.dodinfa3==""){
      this.dodinfa3="NONE"
    }
    else{
      this.dodinfa3=""
    }
  }

  
}
