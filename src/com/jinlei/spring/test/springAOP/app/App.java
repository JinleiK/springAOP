package com.jinlei.spring.test.springAOP.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jinlei.spring.test.springAOP.cameraAccesories.Lens;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jinlei/spring/test/springAOP/app/beans.xml");
		
		ICamera camera = (ICamera) context.getBean("camera");
		Lens lens = (Lens) context.getBean("lens");
		
		try {
			camera.snap();
		} catch (Exception e) {
			System.out.println("caught excetpion " + e.getMessage());
		}
		camera.snap(1000);
		camera.snap(500, 1.8);
		camera.snap("paris");
		camera.snapNightTime();
		camera.snapCar(new Car());
		
		Car car = (Car) context.getBean("car");
		car.start();
		
		lens.zoom(5);
		
		context.close();
	}
}
