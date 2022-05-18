package com.drivingschool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Students implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int sid;
	private String sname;
	private String sage;
	private String semail;
	private String spassword;
	private String slocation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pid")
	private PackageDetails pdetails;

	//default constructor
	public Students() {

	}

	//parameterized constructor
	public Students(int sid, String sname, String sage, String semail, String spassword, String slocation,
			PackageDetails pdetails) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.semail = semail;
		this.spassword = spassword;
		this.slocation = slocation;
		this.pdetails = pdetails;
	}

	//getters and setters
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSage() {
		return sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSlocation() {
		return slocation;
	}

	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}

	public PackageDetails getPdetails() {
		return pdetails;
	}

	public void setPdetails(PackageDetails pdetails) {
		this.pdetails = pdetails;
	}
	
}

