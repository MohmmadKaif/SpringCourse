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
	//Here we are getting the bean(i.e object. Bean and Object are same thing).  
    //Notice we did not use new keyword here to create object.Object is provided by the spring container.
    //This is what is known ad Inversion Of Control(IOC).
    Coach coach= context.getBean("MyCoach",Coach.class);
	
	 coach.getWhatToDo();
	 context.close();
	 return;
	}

}
