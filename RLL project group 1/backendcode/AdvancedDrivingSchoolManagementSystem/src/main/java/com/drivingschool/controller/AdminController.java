package com.drivingschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivingschool.entity.Admin;
import com.drivingschool.service.AdminService;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping(path="/drivingschool")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping(path = "/admin/1")
	      
	public ResponseEntity<Admin> addadmin(@RequestBody Admin admin) {
	    Admin user = adminService.addAdmin(admin);
	    if (user == null) {
	    	 return new ResponseEntity<Admin>(user, HttpStatus.CREATED);
	    } else {
	        return new ResponseEntity<>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	//returns list of admins
	@GetMapping("/admin/1")
	public List<Admin> listAdmin()
	{
		return adminService.getAllAdmin();
	}
	
	//update password for admin
	@PutMapping("/admin/2")
	public Admin updatePwd(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
	}
}
