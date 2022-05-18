import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { PackageDetails } from '../PackageDetails';
import { PackagedetailsService } from '../packagedetails.service';

@Component({
  selector: 'app-removepackagedetails',
  templateUrl: './removepackagedetails.component.html',
  styleUrls: ['./removepackagedetails.component.css']
})
export class RemovepackagedetailsComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: PackagedetailsService, private router:Router) { }

  remForm: FormGroup;
  packages:PackageDetails=new PackageDetails();
  submitted: boolean = false;

  ngOnInit(): void {
    this.remForm = this.formBuilder.group({
      pid: ['', Validators.required]
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
      this.service.removePackage(this.packages).subscribe();
      this.router.navigateByUrl("adminlogin/adash/packdetails");
    }
  }
  getf()
  {
    return this.remForm.controls;
  }

}
