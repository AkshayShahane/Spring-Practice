package com.practice;

import java.util.*;

public class Emp {
	private int empId;
	private String empName;
	private List<String> address;
	private Set<String> phoneNo;
	private Map<String, String> courses;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Set<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp(int empId, String empName, List<String> address, Set<String> phoneNo, Map<String, String> courses) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.courses = courses;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", courses=" + courses + "]";
	}

}
