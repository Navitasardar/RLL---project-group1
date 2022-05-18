import { Component, OnInit } from '@angular/core';
import { PackageDetails } from '../PackageDetails';
import { PackagedetailsService } from '../packagedetails.service';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-choosepackage',
  templateUrl: './choosepackage.component.html',
  styleUrls: ['./choosepackage.component.css']
})
export class ChoosepackageComponent implements OnInit {

  constructor(private service: PackagedetailsService, 
    private service2: StudentService) { }

  packages:PackageDetails[];
  s1:Students=new Students();
  s2:any;

  ngOnInit(): void {
  }

  showLocalPackages()
  {
    this.service.getLocalPackage().subscribe(x=>this.packages=x);
  }

  showRemotePackages()
  {
    this.service.getRemotePackage().subscribe(x=>this.packages=x);
  }

  book(pack:any)
  {
    this.s1.pdetails=pack;
    this.s2=this.service2.getStudentDetails();
    this.s2.pdetails=this.s1.pdetails;
    this.service2.updatePdetails(this.s2).subscribe();
  }

}
