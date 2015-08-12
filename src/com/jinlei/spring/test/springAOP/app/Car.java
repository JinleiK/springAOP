package com.jinlei.spring.test.springAOP.app;

import org.springframework.stereotype.Component;

@Component

public class Car {
	public Car() {
		
	}
	//@Deprecated
	public void start() {
		System.out.println("car starting");
	}
}
