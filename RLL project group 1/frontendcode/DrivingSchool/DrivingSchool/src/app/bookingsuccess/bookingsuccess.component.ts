import { Component, OnInit } from '@angular/core';
import { PackageDetails } from '../PackageDetails';
import { StudentService } from '../student.service';
import { Students } from '../Students';

@Component({
  selector: 'app-bookingsuccess',
  templateUrl: './bookingsuccess.component.html',
  styleUrls: ['./bookingsuccess.component.css']
})
export class BookingsuccessComponent implements OnInit {

  constructor(private service: StudentService) { }

  students:string[];
  sid:any;

  ngOnInit(): void {
    this.sid=this.service.getStudentDetails();
    this.service.getBookingDetails(this.sid).subscribe(x=>this.students=x);
  }

}
