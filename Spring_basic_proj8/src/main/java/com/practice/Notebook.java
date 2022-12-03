package com.practice;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Notebook implements InitializingBean,DisposableBean{
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Notebook [pages=" + pages + "]";
	}

	public void destroy() throws Exception {
		System.out.println("destroy called");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init called");
	}
}
