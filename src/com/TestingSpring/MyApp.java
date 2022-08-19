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
	
    
    /*
     * Now this our driver class.
     * Here we Creating the bean of BaseBallCoach.
     * While creating the bean itself the spring container will create run the setter method and also it will set the value by itself.
     * This is what is the concept of setter injection with value initialization. 
    */
     BaseBallCoach coach= context.getBean("MyBaseBallCoach",BaseBallCoach.class);
     BaseBallCoach coach2= context.getBean("MyBaseBallCoach",BaseBallCoach.class);
     if(coach==coach2)System.out.println("Both refer to same Bean");else System.out.println("Both refer to different Beans");
     coach.getWhatToDo();
	 coach.getDietPlannerConsultation();
	 System.out.println(coach.getFees());
	 context.close();
	 return;
	 
	}

}
