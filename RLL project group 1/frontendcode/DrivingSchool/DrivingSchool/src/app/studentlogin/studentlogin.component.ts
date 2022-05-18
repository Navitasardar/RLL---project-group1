import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService) { }

  loginForm: FormGroup;
  student:Students=new Students();
  a:boolean;
  students:Students[];
  submitted: boolean = false;

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      sname: ['', Validators.required],
      spassword: ['', Validators.required]
    })
  }

  get f() {
    return this.loginForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.loginForm.invalid)
      return;
    else {
      this.service.getStudents().subscribe(x=>this.students=x);
      this.a=this.service.studentLogin(this.student.sname,this.student.spassword,this.students);
    }
  }
  getf()
  {
    return this.loginForm.controls;
  }

}
