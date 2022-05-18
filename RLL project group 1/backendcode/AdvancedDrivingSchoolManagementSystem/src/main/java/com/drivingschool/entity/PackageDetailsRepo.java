package com.drivingschool.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageDetailsRepo extends JpaRepository<PackageDetails, Integer> {

	//finds all packages whose package location is local
	@Query(value=("select * from package_details where package_details.ptrainerlocation= 'local' "), nativeQuery = true)
	public List<PackageDetails> getPackageLocal();
	
	//finds all packages whose package location is remote
	@Query(value=("select * from package_details where package_details.ptrainerlocation= 'remote' "), nativeQuery = true)
	public List<PackageDetails> getPackageRemote();
}
