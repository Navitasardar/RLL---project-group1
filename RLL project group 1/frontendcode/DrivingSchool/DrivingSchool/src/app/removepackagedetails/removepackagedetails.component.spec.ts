import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovepackagedetailsComponent } from './removepackagedetails.component';

describe('RemovepackagedetailsComponent', () => {
  let component: RemovepackagedetailsComponent;
  let fixture: ComponentFixture<RemovepackagedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RemovepackagedetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovepackagedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
