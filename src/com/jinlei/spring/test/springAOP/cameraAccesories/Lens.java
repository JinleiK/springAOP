package com.jinlei.spring.test.springAOP.cameraAccesories;

import org.springframework.stereotype.Component;

@Component
public class Lens {
	public void zoom(int factor) {
		System.out.println("zoom lens: " + factor);
	}
}
