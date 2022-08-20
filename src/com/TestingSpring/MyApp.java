package com.TestingSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
    
	/*
	 * Now here we are creating a Spring Container.
	 * ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml") this how we create a spring container. 
	 * ApplicationContext.xml is our configuration file name. This name can be any thing.
	 * The container is responsible for interacting with configuration file and provide us the object.  
	 * */	
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	
     Coach coach= context.getBean("MyTrackCoach",Coach.class);
     coach.getWhatToDo();
     coach.getDietPlannerConsultation();
	 context.close();
	 return;
	 
	}

}
