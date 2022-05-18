import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PackageDetails } from '../PackageDetails';
import { PackagedetailsService } from '../packagedetails.service';

@Component({
  selector: 'app-addpackagedetails',
  templateUrl: './addpackagedetails.component.html',
  styleUrls: ['./addpackagedetails.component.css']
})
export class AddpackagedetailsComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: PackagedetailsService, private router:Router) { }

  addpackageForm: FormGroup;
  packages:PackageDetails=new PackageDetails();
  submitted: boolean = false;
  
  ngOnInit(): void {
    this.addpackageForm = this.formBuilder.group({
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
    return this.addpackageForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.addpackageForm.invalid)
      return;
    else {
      this.service.addPackage(this.packages).subscribe();
      this.router.navigateByUrl("adminlogin/adash/packdetails");
    }
  }
  getf()
  {
    return this.addpackageForm.controls;
  }

}
