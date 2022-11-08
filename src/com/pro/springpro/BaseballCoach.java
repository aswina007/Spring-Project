package com.pro.springpro;

public class BaseballCoach implements Coach{
	
	//define the private field for dependency
	private FortuneService fortunerservice;
	
	//create the costructor
	public BaseballCoach(FortuneService thefortuneservice) {
		fortunerservice = thefortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		return "30 mins "; 
	}

	@Override
	public String getDailyFortune() {
		return  fortunerservice.getFortune();
	}

}
