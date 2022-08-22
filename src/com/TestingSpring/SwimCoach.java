package com.TestingSpring;


public class SwimCoach {
    private DietPlanner planner;
    public SwimCoach( DietPlanner planner ){
    	System.out.println("SwimCoach: Inside this constructor");
    	this.planner=planner;
    }
	public void getDietPlannerConsultation() {
		planner.provideDietPlanToSwimCoach();
	}
}
