package com.sooriya;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope - used to specify bean scope
@Component
@Scope("prototype")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice batting for daily 30 mins";
	}

}
