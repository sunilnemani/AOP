/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.aop.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aop")
public class AopController
{
	
	@GetMapping(value = "/getAopResponse", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAopResponse()
	{
		System.out.println("[AopController][getAopResponse] : Sunil");
		return "{ \"res\" : \"Get AOP response.\"}";
	}

}
