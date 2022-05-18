package com.drivingschool.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

	//searching for admin using admin username
	@Query(value=("select * from admin where admin.aname= ? "), nativeQuery = true)
	public Admin searchAdmin(String aname);
}
