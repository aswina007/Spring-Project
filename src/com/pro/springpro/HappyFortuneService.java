package com.pro.springpro;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String[] fortunes = {"Good Luck", "All the best" , "God bless"};
		Random rand = new Random();
		return (fortunes[rand.nextInt(3)]);
	}
}
