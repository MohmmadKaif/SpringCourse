package com.TestingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Declaring this calss as bean using the @Component. The value inside the bracket resembles the bean id .
@Component("MyBaseBallCoach")
public class BaseBallCoach extends Coach {
	private DietPlanner planner;
	//Injecting our setter using '@Autowired' annotation.
@Autowired
public void setPlanner(DietPlanner planner){
	System.out.println("BaseBallCoach: Inside this setter");
		this.planner = planner;
}	

@Override
public void getWhatToDo() {
	System.out.println("Do Net Practicse");
}

public void getDietPlannerConsultation() {
   System.out.println("Reduce your carbohydrate consumption and increase your fat and protein consumption");
}


}
