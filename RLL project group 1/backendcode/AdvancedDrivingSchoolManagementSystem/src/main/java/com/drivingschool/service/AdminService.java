package com.drivingschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivingschool.entity.Admin;
import com.drivingschool.entity.AdminRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepo arepo;
	
	public Admin addAdmin(Admin admin) {
		return arepo.save(admin);
	}
	
	//gets list of all admins
	public List<Admin> getAllAdmin() {
		return arepo.findAll();
	}
	
	//finds admin using searchAdmin method and then updates the password
	public Admin updateAdmin(Admin admin)
	{
		Admin a1=arepo.searchAdmin(admin.getAname());
		a1.setApassword(admin.getApassword());
		arepo.save(a1);
		return a1;
	}

	
}
