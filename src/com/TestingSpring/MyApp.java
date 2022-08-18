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
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
    
    /*
     * Now our all coach classes have a parameterized constructor which is used to set the object of DietPlanner.
     * But if you see here we are not using 'new' key word to create the object of coach.
     * Then how are we calling the constructor.
     * That is being done by spring container itself.
     * This is known as constructor injection
     * Please see applicationContext.xml file for knowing the configuration for constructor injection.
    */
    Coach coach= context.getBean("MyBaseBallCoach",Coach.class);
	
	 coach.getWhatToDo();
	 coach.getDietPlannerConsultation();
	 context.close();
	 return;
	}

}
