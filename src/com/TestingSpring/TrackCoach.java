package com.TestingSpring;
/*
This is our TrackCoach class.
This class implements Coach interface.
Thus we are overriding the getWhatToDo() method.
*/
public class TrackCoach implements Coach {
	
	private DietPlanner planner;
	//This is the setter of this class and we are setting the object for the reference created above.

	public void setPlanner(DietPlanner planner) {
		System.out.println(" Inside the setter of TrackCoach class");
        this.planner = planner;
	}
	@Override
    public void getWhatToDo() {
    	System.out.println("Run 5 Kilometers");
    	return;
    }
	@Override
	public void getDietPlannerConsultation() {
     planner.PlanMyDiet();
    }
}
