import { Component, OnInit } from '@angular/core';
import { PackageDetails } from '../PackageDetails';
import { PackagedetailsService } from '../packagedetails.service';

@Component({
  selector: 'app-packdetails',
  templateUrl: './packdetails.component.html',
  styleUrls: ['./packdetails.component.css']
})
export class PackdetailsComponent implements OnInit {

  constructor(private service:PackagedetailsService) { }

  packages:PackageDetails[];
  ngOnInit(): void {
    this.service.getPackageDetails().subscribe(x=>this.packages=x);
  }

}
