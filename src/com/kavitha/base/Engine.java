package com.kavitha.base;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String modelNumber = "qwerty";

//	public Engine(String m) {
//		System.out.println("Inside engine constructor method!!!");
//		this.modelNumber = m;
//	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		System.out.println("Inside Model Number setter  method");
		this.modelNumber = modelNumber;
	}

	public void m() {
		System.out.println("Working");
	}
}
