import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddpackagedetailsComponent } from './addpackagedetails/addpackagedetails.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminlistComponent } from './adminlist/adminlist.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminlogoutComponent } from './adminlogout/adminlogout.component';
import { BookingsuccessComponent } from './bookingsuccess/bookingsuccess.component';
import { ChangepwdadminComponent } from './changepwdadmin/changepwdadmin.component';
import { ChangepwdstudentComponent } from './changepwdstudent/changepwdstudent.component';
import { ChoosepackageComponent } from './choosepackage/choosepackage.component';
import { EditpackagedetailsComponent } from './editpackagedetails/editpackagedetails.component';
import { EditstudentComponent } from './editstudent/editstudent.component';
import { PackdetailsComponent } from './packdetails/packdetails.component';
import { RemovepackagedetailsComponent } from './removepackagedetails/removepackagedetails.component';
import { RemovestudentComponent } from './removestudent/removestudent.component';
import { StudentdashboardComponent } from './studentdashboard/studentdashboard.component';
import { StudentlistComponent } from './studentlist/studentlist.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudentlogoutComponent } from './studentlogout/studentlogout.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';

const routes: Routes = [
  {"path":"adminlogin",component:AdminloginComponent},
  {"path":"adminlogin/adash",component:AdmindashboardComponent},
  {"path":"adminlogin/adash/adminlist",component:AdminlistComponent},
  {"path":"adminlogin/adash/studentlist",component:StudentlistComponent},
  {"path":"adminlogin/adash/studentlist/addstudent",component:AddstudentComponent},
  {"path":"adminlogin/adash/studentlist/editstudent",component:EditstudentComponent},
  {"path":"adminlogin/adash/studentlist/removestudent",component:RemovestudentComponent},
  {"path":"adminlogin/adash/packdetails",component:PackdetailsComponent},
  {"path":"adminlogin/adash/packdetails/addpackage",component:AddpackagedetailsComponent},
  {"path":"adminlogin/adash/packdetails/editpackage",component:EditpackagedetailsComponent},
  {"path":"adminlogin/adash/packdetails/removepackage",component:RemovepackagedetailsComponent},
  {"path":"adminlogin/adash/changepwdadmin",component:ChangepwdadminComponent},
  {"path":"adminlogin/adash/adminlogout",component:AdminlogoutComponent},
  {"path":"studentlogin",component:StudentloginComponent},
  {"path":"studentlogin/studreg",component:StudentregisterComponent},
  {"path":"studentlogin/studdash",component:StudentdashboardComponent},
  {"path":"studentlogin/studdash/choosepkg",component:ChoosepackageComponent},
  {"path":"studentlogin/studdash/choosepkg/booksuccess",component:BookingsuccessComponent},
  {"path":"studentlogin/studdash/changepwdstudent",component:ChangepwdstudentComponent},
  {"path":"studentlogin/studdash/studentlogout",component:StudentlogoutComponent},
  {"path":"home",component:HomeComponent},
  {"path":"navbar",component:NavbarComponent}

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
