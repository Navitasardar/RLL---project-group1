package com.drivingschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivingschool.entity.PackageDetails;
import com.drivingschool.entity.PackageDetailsRepo;

@Service
public class PackageDetailsService {

	@Autowired
	PackageDetailsRepo prepo;
	
	//gets list of all packages
	public List<PackageDetails> getAllPackages()
	{
		return prepo.findAll();
	}
	
	//gets list of all packages whose package location is local
	public List<PackageDetails> getAllPackagesLocal()
	{
		return prepo.getPackageLocal();
	}
	
	//gets list of all packages whose package location is remote
	public List<PackageDetails> getAllPackagesRemote()
	{
		return prepo.getPackageRemote();
	}
	
	//add new package
	public PackageDetails addNewPackage(PackageDetails packages)
	{
		return prepo.save(packages);
	}
	
	//edit package details
	public PackageDetails editPackageDetails(PackageDetails packages)
	{
		PackageDetails p1=prepo.getById(packages.getPid());
		p1.setPname(packages.getPname());
		p1.setPstartingdate(packages.getPstartingdate());
		p1.setPstudentattendance(packages.getPstudentattendance());
		p1.setPvehicle(packages.getPvehicle());
		p1.setPtrainername(packages.getPtrainername());
		p1.setPtrainerlocation(packages.getPtrainerlocation());
		p1.setPtrainerexp(packages.getPtrainerexp());
		prepo.save(p1);
		return p1;
	}
	
	//remove package
	public void removePackageDetails(PackageDetails packages)
	{
		prepo.deleteById(packages.getPid());
	}
}
