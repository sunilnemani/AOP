/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Aspect
public class LoggingAspect
{
	
//	@Before("execution(String com.sunil.myStudy.aop.controller.AopController.getAopResponse())") 		//matches only getAopResponse() method
//	@Before("execution(* com.sunil.myStudy.aop.controller.AopController.getAopResponse(*))")			//matches getAopResponse() method with any return type and any single parameter
//	@Before("execution(String com.sunil.myStudy.aop.controller.AopController.*(String))")				//matches any method in AopController with String return type and String parameter
//	@Before("execution(* com.sunil.myStudy.aop.controller.AopController.*(*))")							//matches any method on AopController with any return type and any single parameter
//	@Before("execution(* com.sunil.myStudy.aop.controller.AopController.*(..))")						//matches any method on AopController with any return type and 0 or more parameters
//	@Before("execution(String com.sunil..getAopResponse())")											//matches getAopResponse() method in sub package of com.sunil with String return type and no parameter
//	@Before("execution(* com.sunil..*(..))")															//matches any method in sub package of com.sunil with any return type and any no. of parameters
//	@Before("within(com.sunil.myStudy.aop.controller.AopController)")									//this pointcut will execute before any method in AopController
//	@Before("within(com.sunil.myStudy.aop..)")															//This pointcut will execute before for any method in package of com.sunil.myStudy.aop
//	@Before("@within(org.springframework.stereotype.Service)")											//This pointcut will execute before methods in a class which has @Service annotation
//	@Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")							//Execute any method that is annotated with given annotation
//	@Before("args(String,..)")																			//Execute any with given arguments. If we need Object than we have to give with complete qualified name like com.sunil.myStudy.aop.controller.AopController
//	@Before("@args(org.springframework.stereotype.Service)")											//Execute any method that class is annotated with given parameter annotation
//	@Before("target(com.sunil.myStudy.aop.service.AopService)")											//Execute this method before when we used AopService instance to call a method
//	@Before("execution(* com.sunil..*(..)) && @within(org.springframework.stereotype.Service)")			//Executes when both the conditions satisfy
//	@Before("execution(* com.sunil..*(..)) || @within(org.springframework.stereotype.Service)")			//Execute when any one conditions satisfy
	@Before("customPointcut()")
	public void beforeMethodExe()
	{
		System.out.println("---------------------------------beforeMethodExe------------------------------------");
	}
	
	@After("execution(public String com.sunil.myStudy.aop.controller.AopController.getAopResponse())")
	public void afterMethodExe()
	{
		System.out.println("---------------------------------------------------------------------");
	}
	
	@Pointcut("execution(* com.sunil.myStudy.aop.controller.AopController.getAopResponse(*))")
	public void customPointcut()
	{
		//Method with no code
	}
	
	@Around("execution(* com.sunil..*(..))")
	public void aroundMethodExe(ProceedingJoinPoint proceedingJoint) throws Throwable
	{
		System.out.println("---Executing before code---");
		proceedingJoint.proceed();			//It ll invoke calling method
		System.out.println("---Executing after code---");
	}
	
}
