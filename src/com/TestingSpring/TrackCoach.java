package com.TestingSpring;

import org.springframework.stereotype.Component;

/*
This is our TrackCoach class.
This class implements Coach interface.
Thus we are overriding the getWhatToDo() method.
*/
@Component("MyTrackCoach")
public class TrackCoach extends Coach {
	
	
	@Override
    public void getWhatToDo() {
    	System.out.println("Run 5 Kilometers");
    	return;
    }
}
