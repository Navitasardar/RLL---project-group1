import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminlistComponent } from './adminlist/adminlist.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { ChangepwdadminComponent } from './changepwdadmin/changepwdadmin.component';
import { AdminlogoutComponent } from './adminlogout/adminlogout.component';
import { AddpackagedetailsComponent } from './addpackagedetails/addpackagedetails.component';
import { EditpackagedetailsComponent } from './editpackagedetails/editpackagedetails.component';
import { RemovepackagedetailsComponent } from './removepackagedetails/removepackagedetails.component';
import { PackdetailsComponent } from './packdetails/packdetails.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { EditstudentComponent } from './editstudent/editstudent.component';
import { RemovestudentComponent } from './removestudent/removestudent.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { StudentdashboardComponent } from './studentdashboard/studentdashboard.component';
import { ChoosepackageComponent } from './choosepackage/choosepackage.component';
import { ChangepwdstudentComponent } from './changepwdstudent/changepwdstudent.component';
import { StudentlogoutComponent } from './studentlogout/studentlogout.component';
import { BookingsuccessComponent } from './bookingsuccess/bookingsuccess.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    StudentloginComponent,
    AdmindashboardComponent,
    AdminlistComponent,
    StudentlistComponent,
    ChangepwdadminComponent,
    AdminlogoutComponent,
    AddpackagedetailsComponent,
    EditpackagedetailsComponent,
    RemovepackagedetailsComponent,
    PackdetailsComponent,
    AddstudentComponent,
    EditstudentComponent,
    RemovestudentComponent,
    StudentregisterComponent,
    StudentdashboardComponent,
    ChoosepackageComponent,
    ChangepwdstudentComponent,
    StudentlogoutComponent,
    BookingsuccessComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
