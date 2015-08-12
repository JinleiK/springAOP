package com.jinlei.spring.test.springAOP.introduction;

import org.springframework.stereotype.Component;

@Component
public class Blender implements IBlender {
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.introduction.IBlender#blend()
	 */
	@Override
	public void blend() {
		System.out.println("blending...");
	}
}
