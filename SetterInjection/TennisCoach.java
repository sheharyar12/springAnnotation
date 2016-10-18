package com.sheharyar.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService myFortuneService;
	
	
	public TennisCoach(){
		System.out.println("Inside TennisCoach constructor");
		
	}
	/*
	@Autowired	
	public TennisCoach(FortuneService myFortuneService){
		this.myFortuneService = myFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}

	@Autowired
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	
	
	

	
	

}
