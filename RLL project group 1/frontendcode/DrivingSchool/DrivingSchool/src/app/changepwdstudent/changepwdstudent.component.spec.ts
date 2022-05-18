import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangepwdstudentComponent } from './changepwdstudent.component';

describe('ChangepwdstudentComponent', () => {
  let component: ChangepwdstudentComponent;
  let fixture: ComponentFixture<ChangepwdstudentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChangepwdstudentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangepwdstudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
