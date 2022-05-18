import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpackagedetailsComponent } from './addpackagedetails.component';

describe('AddpackagedetailsComponent', () => {
  let component: AddpackagedetailsComponent;
  let fixture: ComponentFixture<AddpackagedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpackagedetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddpackagedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
