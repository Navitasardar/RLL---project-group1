import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-removestudent',
  templateUrl: './removestudent.component.html',
  styleUrls: ['./removestudent.component.css']
})
export class RemovestudentComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService, private router:Router) { }

  remForm: FormGroup;
  students:Students=new Students();
  submitted: boolean = false;

  ngOnInit(): void {
    this.remForm = this.formBuilder.group({
      sid: ['', Validators.required]
    })
  }

  get f() {
    return this.remForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.remForm.invalid)
      return;
    else {
      this.service.removeStudent(this.students).subscribe();
      this.router.navigateByUrl("adminlogin/adash/studentlist");
    }
  }
  getf()
  {
    return this.remForm.controls;
  }

}
