import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Students } from './Students';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private baseurl = "http://localhost:8282/drivingschool/student/1";
  url1: string = "http://localhost:8282/drivingschool/student/list";
  url2: string = "http://localhost:8282/drivingschool/student/insert";
  url3: string = "http://localhost:8282/drivingschool/student/edit";
  url4: string = "http://localhost:8282/drivingschool/student/remove";
  url5: string = "http://localhost:8282/drivingschool/student/updatepwd";
  url6: string = "http://localhost:8282/drivingschool/student/package";
  url7: string = "http://localhost:8282/drivingschool/student/bookingdetails";

  flag: number = 0;
  stud: any;

  constructor(private http: HttpClient, private router: Router) { }

  getStudents(): Observable<Students[]> {
    return this.http.get<Students[]>(`${this.baseurl}`);
  }

  addStudent(students: any): Observable<Students[]> {
    return this.http.post<Students[]>(this.url2, students);
  }

  editStudent(students: any): Observable<Students[]> {
    return this.http.put<Students[]>(this.url3, students);
  }

  removeStudent(students: any): Observable<Students[]> {
    return this.http.put<Students[]>(this.url4, students);
  }

  studentLogin(name: String, password: String, students: any): boolean {
    for (let s of students) {
      if (s.sname === name && s.spassword === password) {
        this.stud = s;
        this.router.navigateByUrl("studentlogin/studdash");
        this.flag = 1;
      }
    }
    if (this.flag === 1) {
      this.flag = 0;
      return true;
    }
    else
      return false;
  }

  changepwd(student: any): Observable<Students[]> {
    return this.http.put<Students[]>(this.url5, student);
  }

  pwdchangeSuccess(name: String, student: any): boolean {
    for (let s of student) {
      if (s.sname === name) {
        this.flag = 1;
      }
    }
    if (this.flag === 1) {
      this.flag = 0;
      return true;
    }
    else
      return false;
  }

  getStudentDetails() {
    console.log(this.stud);
    return this.stud;
  }

  updatePdetails(s: any): Observable<Students[]> {
    console.log(s);
    return this.http.put<Students[]>(this.url6, s);
  }

  getBookingDetails(s: any): Observable<string[]> {
    return this.http.put<string[]>(this.url7, s);
  }
}
