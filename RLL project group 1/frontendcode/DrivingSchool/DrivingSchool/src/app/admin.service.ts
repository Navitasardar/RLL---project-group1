import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Admin } from './Admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  private baseurl = "http://localhost:8282/drivingschool/admin/1";
  url1: string = "http://localhost:8282/drivingschool/admin/list";
  
  url2: string = "http://localhost:8282/drivingschool/admin/updatepwd";

  flag: number = 0;

  constructor(private http: HttpClient, private router: Router) { }

  getAdmins(): Observable<Admin[]> {
    return this.http.get<Admin[]>(`${this.baseurl}`);
  }

  login(name: String, password: String, admins: any): boolean {
    for (let a of admins) {
      if (a.aname === name && a.apassword === password) {
        this.router.navigateByUrl("adminlogin/adash");
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

  changepwd(admin: any): Observable<Admin[]> {
    return this.http.put<Admin[]>(this.url2, admin);
  }

  pwdchangeSuccess(name: String, admin: any): boolean {
    for (let a of admin) {
      if (a.aname === name) {
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

}
