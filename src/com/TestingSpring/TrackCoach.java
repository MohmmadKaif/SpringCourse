package com.TestingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
This is our TrackCoach class.
This class implements Coach interface.
Thus we are overriding the getWhatToDo() method.
*/
@Component("MyTrackCoach")
public class TrackCoach extends Coach {
	private DietPlanner planner;
	
/*Now here we are injecting our setter using '@Autowired' annotation*/	
	@Autowired
    public void setPlanner(DietPlanner planner) {
		System.out.println("TrackCoach: Inside this setter");
		this.planner = planner;
	}
	
	@Override
    public void getWhatToDo() {
    	System.out.println("Run 5 Kilometers");
    	return;
    }
	

	public void getDietPlannerConsultation() {
		   System.out.println("Increase your fat and protein consumption along with this also increase the intake of water.");
		}

}
