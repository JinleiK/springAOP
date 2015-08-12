package com.jinlei.spring.test.springAOP.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jinlei/spring/test/springAOP/introduction/beans.xml");
		
		IBlender blender = (IBlender) context.getBean("blender");
		blender.blend();
		
		//((IMachine)blender).start();
		
		IFan fan = (IFan) context.getBean("fan");
		fan.active(5);
		
		//((IMachine)fan).start();
		
		context.close();
	}

}
