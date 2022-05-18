import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PackageDetails } from './PackageDetails';

@Injectable({
  providedIn: 'root'
})
export class PackagedetailsService {
  private baseurl = "http://localhost:8282/drivingschool/packages/1";
  url1: string = "http://localhost:8282/drivingschool/packages/list";
  url2: string = "http://localhost:8282/drivingschool/packages/insert";
  url3: string = "http://localhost:8282/drivingschool/packages/edit";
  url4: string = "http://localhost:8282/drivingschool/packages/remove";
  url5: string = "http://localhost:8282/drivingschool/packages/list/local";
  url6: string = "http://localhost:8282/drivingschool/packages/list/remote";

  constructor(private http: HttpClient) { }

  getPackageDetails(): Observable<PackageDetails[]> {
    return this.http.get<PackageDetails[]>(`${this.baseurl}`);
  }

  addPackage(packages: any): Observable<PackageDetails[]> {
    return this.http.post<PackageDetails[]>(this.url2, packages);
  }

  editPackage(packages: any): Observable<PackageDetails[]> {
    return this.http.put<PackageDetails[]>(this.url3, packages);
  }

  removePackage(packages: any): Observable<PackageDetails[]> {
    return this.http.put<PackageDetails[]>(this.url4, packages);
  }

  getLocalPackage(): Observable<PackageDetails[]> {
    return this.http.get<PackageDetails[]>(this.url5);
  }

  getRemotePackage(): Observable<PackageDetails[]> {
    return this.http.get<PackageDetails[]>(this.url6);
  }
}
