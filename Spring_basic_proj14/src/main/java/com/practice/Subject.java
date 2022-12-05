package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("Hindi")
	private String name;
	
	@Value("#{temp}")
	private List<String> addresses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject(String name) {
		super();
		this.name = name;
	}

	public Subject() {
		super();
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "Address ["+addresses+" ]"+"]";
	}

}
