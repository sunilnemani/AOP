package com.sunil.myStudy.aop.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sunil.myStudy.*")
@EnableAutoConfiguration
public class AopApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) 
	{
		SpringApplication.run(AopApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(AopApplication.class);
	}

}
