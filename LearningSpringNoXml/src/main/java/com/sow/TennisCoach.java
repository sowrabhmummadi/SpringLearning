package com.sow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

	@Value("${foo.name}")
	private String name;

	@Value("${foo.email}")
	private String email;

	@Autowired
	private FortuneService fortuneService;



	@Override
	public String getDailyWorkout() {
		System.out.println("name = " + name);
		System.out.println("email = " + email);
		return "Practice your backhand volley";
	}

	@Override
	public String getFortuneMessage() {
		return fortuneService.getFortuneMessage();
	}

	@PreDestroy
	private void teardown(){
		System.out.println("Coach destroyed");
	}

	@PostConstruct
	private  void init(){
		System.out.println("Coach initialized");
	}

}
