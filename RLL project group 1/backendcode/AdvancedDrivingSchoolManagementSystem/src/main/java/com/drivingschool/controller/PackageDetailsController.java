package com.drivingschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivingschool.entity.PackageDetails;
import com.drivingschool.service.PackageDetailsService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/drivingschool")
public class PackageDetailsController {

	@Autowired
	private PackageDetailsService packagedetailsService;
	
	//returns list of packages
	@GetMapping("/packages/1")
	public List<PackageDetails> listPackages()
	{
		return packagedetailsService.getAllPackages();
	}
	
	//returns list of packages whose package location is local
			@GetMapping("/packages/1 ")
			public List<PackageDetails> listPackagesLocal()
			{
				return packagedetailsService.getAllPackagesLocal();
			}

	


	
	
	//insert new package
	@PostMapping("/packages/1")
	public PackageDetails addPackage(@RequestBody PackageDetails packages)
	{
		return packagedetailsService.addNewPackage(packages);
	}
	
	//edit package details
	@PutMapping("/packages/4")
	public PackageDetails editPackage(@RequestBody PackageDetails packages)
	{
		return packagedetailsService.editPackageDetails(packages);
	}
	
	//remove a package
	@PutMapping("/packages/5")
	public void removePackage(@RequestBody PackageDetails packages)
	{
		packagedetailsService.removePackageDetails(packages);
	}
}
