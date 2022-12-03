package com.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Laptop {
	private String modelName;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		return "Laptop [modelName=" + modelName + "]";
	}

	@PostConstruct
	public void beanInit() {
		System.out.println("init called");
	}
	
	@PreDestroy
	public void beanDestroy() {
		System.out.println("destroy called");
	}
}
