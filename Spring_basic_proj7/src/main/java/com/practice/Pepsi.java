package com.practice;

public class Pepsi {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	public void beanInit() {
		System.out.println("init executed");
	}
	
	public void beanDestroy() {
		System.out.println("destroy executed");
	}
}
