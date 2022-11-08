package com.pro.springpro;

public class TrackCoach implements Coach {
	
	private FortuneService theFortuneService;
	
	public  TrackCoach() {
		
	}
	
	TrackCoach(FortuneService fortuneService){
		theFortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "20 mins run";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
