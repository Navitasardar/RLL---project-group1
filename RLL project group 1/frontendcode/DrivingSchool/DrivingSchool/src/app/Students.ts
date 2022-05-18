export class Students
{
    sid:number;
    sname:string;
    sage:number;
    semail:string;
    spassword:string;
    slocation:string;
    pdetails: [{
        pid:number;
        pname:string;
        pstartingdate:Date;
        pstudentattendance:string;
        pvehicle:string;
        ptrainername:string;
        ptrainerlocation:string;
        ptrainerexp:number;
    }]
}