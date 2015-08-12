package com.jinlei.spring.test.springAOP.introduction;

import org.springframework.stereotype.Component;

@Component	
public class Fan implements IFan {
	/* (non-Javadoc)
	 * @see com.jinlei.spring.test.springAOP.introduction.IFan#active(int)
	 */
	@Override
	public void active(int level) {
		System.out.println("Fan running at level " + level);
	}
}
