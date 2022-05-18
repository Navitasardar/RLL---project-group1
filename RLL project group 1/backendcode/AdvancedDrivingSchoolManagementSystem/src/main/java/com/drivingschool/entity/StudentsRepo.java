package com.drivingschool.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository<Students, Integer> {

	//searching for student using student username
	@Query(value=("select * from students where students.sname= ? "), nativeQuery = true)
	public Students searchStudent(String sname);
	
	//gets booking details
	@Query(value=("select students.sname, students.sage, students.slocation, package_details.pname, package_details.pstartingdate,"
			+ " package_details.pvehicle, package_details.ptrainername, package_details.ptrainerlocation, package_details.ptrainerexp from students inner join package_details on"
			+ " students.pid=package_details.pid where students.sid= ?"), nativeQuery = true)
	public List<String> getDetails(int sid);
}
