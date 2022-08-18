package com.TestingSpring;
/*
 This is our BaseBall coach class.
 This class implements Coach interface.
 Thus we are overriding the getWhatToDo() method.
 */
public class BaseBallCoach implements Coach {
	//Creating the DietPlanner reference.
	private DietPlanner planner;
	//This is the constructor of this class and we are setting the object for the reference created above.
	public BaseBallCoach( DietPlanner planner  ) {
		this.planner=planner;
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
