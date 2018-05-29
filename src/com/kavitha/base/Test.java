package com.kavitha.base;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public void display(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Car car = (Car) ac.getBean("car");
		car.printData();
	}
}
