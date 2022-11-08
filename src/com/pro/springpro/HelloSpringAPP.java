package com.pro.springpro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAPP {

	public static void main(String[] args) {
		
		//load spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		
		//calls dependency new methods
		System.out.println(theCoach.getDailyFortune()); 
		
		//close context
		context.close();
	}

}	
