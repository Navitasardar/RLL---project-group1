package com.drivingschool.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class PackageDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int pid;
	private String pname;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date pstartingdate;
	private String pstudentattendance;
	private String pvehicle;
	private String ptrainername;
	private String ptrainerlocation;
	private int ptrainerexp;
	
	@OneToMany(mappedBy = "pdetails")
	@JsonIgnore
	private List<Students> students = new ArrayList<>();

	//default constructor
	public PackageDetails() {
		
	}

	//parameterized constructor
	public PackageDetails(int pid, String pname, Date pstartingdate, String pstudentattendance, String pvehicle,
			String ptrainername, String ptrainerlocation, int ptrainerexp, List<Students> students) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pstartingdate = pstartingdate;
		this.pstudentattendance = pstudentattendance;
		this.pvehicle = pvehicle;
		this.ptrainername = ptrainername;
		this.ptrainerlocation = ptrainerlocation;
		this.ptrainerexp = ptrainerexp;
		this.students = students;
	}

	//getters and setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getPstartingdate() {
		return pstartingdate;
	}

	public void setPstartingdate(Date pstartingdate) {
		this.pstartingdate = pstartingdate;
	}

	public String getPstudentattendance() {
		return pstudentattendance;
	}

	public void setPstudentattendance(String pstudentattendance) {
		this.pstudentattendance = pstudentattendance;
	}

	public String getPvehicle() {
		return pvehicle;
	}

	public void setPvehicle(String pvehicle) {
		this.pvehicle = pvehicle;
	}

	public String getPtrainername() {
		return ptrainername;
	}

	public void setPtrainername(String ptrainername) {
		this.ptrainername = ptrainername;
	}

	public String getPtrainerlocation() {
		return ptrainerlocation;
	}

	public void setPtrainerlocation(String ptrainerlocation) {
		this.ptrainerlocation = ptrainerlocation;
	}

	public int getPtrainerexp() {
		return ptrainerexp;
	}

	public void setPtrainerexp(int ptrainerexp) {
		this.ptrainerexp = ptrainerexp;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
}
