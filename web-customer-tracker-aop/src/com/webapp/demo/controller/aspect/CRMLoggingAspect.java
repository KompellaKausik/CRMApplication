package com.webapp.demo.controller.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	@Pointcut("execution(* com.webapp.demo.controller.*.*(..))")
	private void forControllerPackage() { }
	
	@Pointcut("execution(* com.webapp.demo.service.*.*(..))")
	private void forServicePackage() { }
	
	@Pointcut("execution(* com.webapp.demo.dao.*.*(..))")
	private void forDaoPackage() { }
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	public void appFlow() { }
	
	@Before("appFlow()")
	public void before(JoinPoint theJoinPoint) {
		
		String theMethod = theJoinPoint.getSignature().toShortString();
		
		System.out.println("===========>>>>>>>>> theMethod " + theMethod);
		
	}
	
}
