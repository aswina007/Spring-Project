package com.pro.springpro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach" , Coach.class);
		
		boolean result =( theCoach == alphaCoach);
		

	}

}
