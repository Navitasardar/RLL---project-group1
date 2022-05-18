import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-changepwdstudent',
  templateUrl: './changepwdstudent.component.html',
  styleUrls: ['./changepwdstudent.component.css']
})
export class ChangepwdstudentComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: StudentService) { }

  changepwdForm: FormGroup;
  student:Students=new Students();
  s:Students[];
  r:boolean;
  submitted: boolean = false;

  ngOnInit(): void {
    this.changepwdForm = this.formBuilder.group({
      sname: ['', Validators.required],
      spassword: ['', Validators.required]
    })
    this.service.getStudents().subscribe(x=>this.s=x);
  }

  get f() {
    return this.changepwdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.changepwdForm.invalid)
      return;
    else {
      this.r=this.service.pwdchangeSuccess(this.student.sname,this.s);
      this.service.changepwd(this.student).subscribe();
    }
  }
  getf()
  {
    return this.changepwdForm.controls;
  }

}
