import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TytulkaComponent } from './tytulka.component';

describe('TytulkaComponent', () => {
  let component: TytulkaComponent;
  let fixture: ComponentFixture<TytulkaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TytulkaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TytulkaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
