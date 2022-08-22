package com.TestingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Now this is our configuration class.This is a replacement of our spring configuration file(xml) . USing this class we will declare our beans*
 * To declare this class as configuration class we @Configuration annotation . 
 * */

@Configuration
public class SportsConfig {
   /*
    * Now below we are declaring our DietPlanner as Bean.We do this using @Bean annotation
    * This class i.e DietPlanner is our dependency class for SwimCoach class.
    * Now for our beanId will be the name of the method. In this case our bean id will be dietPlanner' as this is the name of our method.
   */
	@Bean
	public DietPlanner/*This is our id name as well*/dietPlanner() {
		return new DietPlanner();
	}
	
	@Bean
	public SwimCoach swimCoach(){
		//Here we are injecting our DietPlanner class inside SwimCoach.And this is how we do it. 
		return new SwimCoach(dietPlanner());
	}
	
}
