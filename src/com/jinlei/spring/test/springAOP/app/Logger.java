package com.jinlei.spring.test.springAOP.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
//aspect (note)
public class Logger {
//	@Pointcut("execution(* com.jinlei.spring.test.springAOP.app.Camera.snap(..))")
//	public void cameraSnap() {
//		
//	}
	
//	@Pointcut("within(com.jinlei.spring.test.springAOP..*)")
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void beforeAdvice() {
//		System.out.println("#########BEFORE ADVICE#######");
//	}
	
//	//within
//	@Pointcut("@target(org.springframework.stereotype.Component)")
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void beforeAdvice() {
//		System.out.println("#########BEFORE ADVICE#######");
//	}
	
//	@Pointcut("@annotation(java.lang.Deprecated)")
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void beforeAdvice() {
//		System.out.println("#########BEFORE ADVICE#######");
//	}
	
//	@Pointcut("@args(org.springframework.stereotype.Component)")
//	public void somePointcut() {
//		
//	}
//	
//	@Before("somePointcut()")
//	public void beforeAdvice() {
//		System.out.println("#########BEFORE ADVICE#######");
//	}
	
	@Pointcut("args(exposure, aperture)")
	public void somePointcut(int exposure, double aperture) {
		
	}
	
	@Pointcut("target(com.jinlei.spring.test.springAOP.app.Camera)")
	public void targetCamera() {
		
	}
	
	@Before("targetCamera() && somePointcut(exposure, aperture)")
	public void beforeAdvice(JoinPoint jp, int exposure, double aperture) {
		System.out.println("#########BEFORE ADVICE#######");
		
//		for (Object obj : jp.getArgs()) {
//			System.out.println("ARG:" + obj);
//		}
		
		System.out.printf("ARGS: exposure %d, aperture %.2f\n", exposure, aperture);
	}
	
	@After("within(com.jinlei.spring.test.springAOP.app.*) && !@annotation(Deprecated)")
	public void afterAdvice() {
		System.out.println("After advice running......");
	}
	
//	
//	@Pointcut("execution(* com.jinlei.spring.test.springAOP.app.Camera.snap(String))")
//	public void cameraSnapName() {
//		
//	}
//	
//	@Pointcut("execution(* *.*(..))")
//	public void cameraRelatedAction() {
//		
//	}
	

	
//	//advice  (note)
//	@Before("cameraSnap()")
//	public void beforeAdvice() {
//		System.out.println("about to take photo..");
//	}
//	
//	@After("cameraSnap()")
//	public void afterAdvice() {
//		System.out.println("finish to take photo..");
//	}
//	
//	@AfterReturning("cameraSnap()")
//	public void afterReturningAdvice() {
//		System.out.println("finish to take photo after returning..");
//	}
//	
//	@AfterThrowing("cameraSnap()")
//	public void afterThrowingAdvice() {
//		System.out.println("finish to take photo after throwing..");
//	}
//	
//	@Around("cameraSnap()")
//	public void aroundAdvice() {
//		System.out.println("finish to take photo around..");
//	}
//	
//	@Before("cameraSnapName()")
//	public void aboutToTakePhotoWithName() {
//		System.out.println("about to take photo with name..");
//	}
//	
//	@Before("cameraRelatedAction()")
//	public void aboutToDoCameraRelatedAction() {
//		System.out.println("about to do anything related to camera..");
//	}
}
