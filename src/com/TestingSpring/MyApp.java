package com.TestingSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
    
	/*
	 * Now here we are creating a Spring Container.
	 * Now here as we are not using configuration(xml) file the process of creating the context object is given below.It obtained using AnnotationConfigApplicationContext class
     * The container is responsible for interacting with configuration file and provide us the object.  
	 * */	
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
    SwimCoach coach= context.getBean("swimCoach",SwimCoach.class);
    coach.getDietPlannerConsultation();
	 
	}

}
