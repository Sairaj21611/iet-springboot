package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvices {

	@Before("execution(* com.demo.M*.m*(..))")
	public void beforeAdvice() {
		System.out.println("Before advice");
	}

	@After("execution(* com.demo.beans.M*.m*(..))")
	public void afterAdvice() {
		System.out.println("After advice");
	}

	@Around("execution(* com.demo.beans.M*.m*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjoint) throws Throwable {

		System.out.println("In aroundAdive and Before in actual function");
		Object ob = pjoint.proceed();

		System.out.println("In aroundAdive and after in actual function");
		return ob;

	}
}
