package com.TestingSpring;
/*
 This is our BaseBall coach class.
 This class implements Coach interface.
 Thus we are overriding the getWhatToDo() method.
 */
public class BaseBallCoach extends Coach {
	//Creating the DietPlanner reference.
	private DietPlanner planner;
	private double fees;
	
	
//This is the setter of this class and we are setting the object for the reference created above.
	public void setPlanner(DietPlanner planner) {
	    System.out.println("Inside the setter of BaseBallCoach class");
		this.planner = planner;
	}
	

//Here we are setting the fees.....
public void setFees(double fees) {
	System.out.println("Setting the fees for BaseBallCoach");
		this.fees = fees;
	}
//This is our getter for fees..
public double getFees() {
		return fees;
	}

@Override	
public void getWhatToDo() {
	System.out.println("Do Net Practicse");
}


@Override
public void getDietPlannerConsultation() {
	planner.PlanMyDiet();
}

}
