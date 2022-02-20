import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormaVzaemidiiComponent } from './forma-vzaemidii.component';

describe('FormaVzaemidiiComponent', () => {
  let component: FormaVzaemidiiComponent;
  let fixture: ComponentFixture<FormaVzaemidiiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormaVzaemidiiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormaVzaemidiiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
