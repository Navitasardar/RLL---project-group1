import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-editstudent',
  templateUrl: './editstudent.component.html',
  styleUrls: ['./editstudent.component.css']
})
export class EditstudentComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService, private router:Router) { }

  editstdForm: FormGroup;
  students:Students=new Students();
  submitted: boolean = false;

  ngOnInit(): void {
    this.editstdForm = this.formBuilder.group({
      sid: ['', Validators.required],
      sname: ['', Validators.required],
      sage: ['', Validators.required],
      semail: ['', Validators.required],
      spassword: ['', Validators.required],
      slocation: ['', Validators.required]
    })
  }

  get f() {
    return this.editstdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.editstdForm.invalid)
      return;
    else {
      this.service.editStudent(this.students).subscribe();
      this.router.navigateByUrl("adminlogin/adash/studentlist");
    }
  }
  getf()
  {
    return this.editstdForm.controls;
  }

}
