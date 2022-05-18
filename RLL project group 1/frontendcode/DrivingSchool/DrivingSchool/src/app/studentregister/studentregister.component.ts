import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-studentregister',
  templateUrl: './studentregister.component.html',
  styleUrls: ['./studentregister.component.css']
})
export class StudentregisterComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService) { }

  regstdForm: FormGroup;
  student:Students=new Students();
  r:boolean;
  submitted: boolean = false;

  ngOnInit(): void {
    this.regstdForm = this.formBuilder.group({
      sname: ['', Validators.required],
      sage: ['', Validators.required],
      semail: ['', Validators.required],
      spassword: ['', Validators.required],
      slocation: ['', Validators.required]
    })
  }

  get f() {
    return this.regstdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.regstdForm.invalid)
      return;
    else {
      this.service.addStudent(this.student).subscribe();
      this.r=true;
    }
  }
  getf()
  {
    return this.regstdForm.controls;
  }

}
