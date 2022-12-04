package com.practice;

public class Student {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
