package com.drivingschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivingschool.entity.PackageDetails;
import com.drivingschool.entity.Students;
import com.drivingschool.entity.StudentsRepo;

@Service
public class StudentsService {

	@Autowired
	StudentsRepo srepo;
	
	//add new student
	public Students addNewStudent(Students students)
	{
		return srepo.save(students);
	}
	
	//get a list of all students
	public List<Students> getAllStudents()
	{
		return srepo.findAll();
	}
	
	//finds student using searchStudent method and then updates the password
	public Students updateStudentPwd(Students students)
	{
		Students s1=srepo.searchStudent(students.getSname());
		s1.setSpassword(students.getSpassword());
		srepo.save(s1);
		return s1;
	}
	
	//edit student details
	public Students updateStudentDetails(Students students)
	{
		Students s2=srepo.getById(students.getSid());
		s2.setSname(students.getSname());
		s2.setSage(students.getSage());
		s2.setSemail(students.getSemail());
		s2.setSlocation(students.getSlocation());
		srepo.save(s2);
		return s2;
	}
	
	//insert package details chosen by the student
	public Students updateStudentPackageDetails(Students students)
	{
		Students s3=srepo.getById(students.getSid());
		s3.setPdetails(students.getPdetails());
		srepo.save(s3);
		return s3;
	}
	
	//gets final booking details
	public List<String> getBookingDetails(Students students)
	{
		return srepo.getDetails(students.getSid());
	}
	
	//remove a student
	public void removeStudentDetails(Students students)
	{
		srepo.deleteById(students.getSid());
	}
}
