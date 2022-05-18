import { Component, OnInit } from '@angular/core';
import { PackageDetails } from '../PackageDetails';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-studentlist',
  templateUrl: './studentlist.component.html',
  styleUrls: ['./studentlist.component.css']
})
export class StudentlistComponent implements OnInit {

  constructor(private service:StudentService) { }

  students:Students[];
  
  ngOnInit(): void {
    this.service.getStudents().subscribe(x=>this.students=x);
  }

}
