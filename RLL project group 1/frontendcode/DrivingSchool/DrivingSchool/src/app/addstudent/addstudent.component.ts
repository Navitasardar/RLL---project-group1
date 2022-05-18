import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-addstudent',
  templateUrl: './addstudent.component.html',
  styleUrls: ['./addstudent.component.css']
})
export class AddstudentComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService, private router:Router) { }

  addstdForm: FormGroup;
  students:Students=new Students();
  submitted: boolean = false;

  ngOnInit(): void {
    this.addstdForm = this.formBuilder.group({
      sname: ['', Validators.required],
      sage: ['', Validators.required],
      semail: ['', Validators.required],
      spassword: ['', Validators.required],
      slocation: ['', Validators.required]
    })
  }

  get f() {
    return this.addstdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.addstdForm.invalid)
      return;
    else {
      this.service.addStudent(this.students).subscribe();
      this.router.navigateByUrl("adminlogin/adash/studentlist");
    }
  }
  getf()
  {
    return this.addstdForm.controls;
  }

}
