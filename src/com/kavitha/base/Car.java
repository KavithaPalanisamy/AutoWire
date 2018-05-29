package com.kavitha.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	@Autowired
	public Car(Engine e) {
		System.out.println("Inside Car constructor!!!");
		this.engine = e;
	}

	public void printData() {
		System.out.println(engine.getModelNumber());
	}

}
