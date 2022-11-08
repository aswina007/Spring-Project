package com.pro.springpro;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String teamName;
	

	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter method -- email");
		this.emailAddress = emailAddress;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		System.out.println("inside setter method -- teamName");
		this.teamName = teamName;
	}



	public CricketCoach() {
		System.out.println("Inside no arg constructor");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter method cricket");
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "cricket 20";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
