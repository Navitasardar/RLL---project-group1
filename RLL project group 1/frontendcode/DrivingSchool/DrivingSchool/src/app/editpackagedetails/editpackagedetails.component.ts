import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PackageDetails } from '../PackageDetails';
import { PackagedetailsService } from '../packagedetails.service';

@Component({
  selector: 'app-editpackagedetails',
  templateUrl: './editpackagedetails.component.html',
  styleUrls: ['./editpackagedetails.component.css']
})
export class EditpackagedetailsComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: PackagedetailsService, private router:Router) { }

  editpackageForm: FormGroup;
  packages:PackageDetails=new PackageDetails();
  submitted: boolean = false;

  ngOnInit(): void {
    this.editpackageForm = this.formBuilder.group({
      pid: ['', Validators.required],
      pname: ['', Validators.required],
      pstartingdate: ['', Validators.required],
      pstudentattendance: ['', Validators.required],
      pvehicle: ['', Validators.required],
      ptrainername: ['', Validators.required],
      ptrainerlocation: ['', Validators.required],
      ptrainerexp: ['', Validators.required]
    })
  }

  get f() {
    return this.editpackageForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.editpackageForm.invalid)
      return;
    else {
      this.service.editPackage(this.packages).subscribe();
      this.router.navigateByUrl("adminlogin/adash/packdetails");
    }
  }
  getf()
  {
    return this.editpackageForm.controls;
  }

}
