import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditpackagedetailsComponent } from './editpackagedetails.component';

describe('EditpackagedetailsComponent', () => {
  let component: EditpackagedetailsComponent;
  let fixture: ComponentFixture<EditpackagedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditpackagedetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditpackagedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
