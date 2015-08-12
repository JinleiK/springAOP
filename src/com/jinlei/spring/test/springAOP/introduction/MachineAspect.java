package com.jinlei.spring.test.springAOP.introduction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MachineAspect {
	
	@DeclareParents(value="com.jinlei.spring.test.springAOP.introduction.*", defaultImpl=com.jinlei.spring.test.springAOP.introduction.Machine.class)
	private IMachine machine;
	
	@Around("within(com.jinlei.spring.test.springAOP.introduction.*)")
	public void runMachine(ProceedingJoinPoint jp){
		
		System.out.println("running..");
		try{
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("...Complete");
	}
}
