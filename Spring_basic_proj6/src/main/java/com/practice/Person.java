package com.practice;

import java.util.*;

public class Person {
	private String name;
	private List<String> address;
	private Set<String> phoneNo;
	private Map<String, String> courses;

	public Person(String name, List<String> address, Set<String> phoneNo, Map<String, String> courses) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.courses = courses;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", courses=" + courses + "]";
	}

}
