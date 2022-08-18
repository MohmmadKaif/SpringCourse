package com.TestingSpring;
/*
This is our TrackCoach class.
This class implements Coach interface.
Thus we are overriding the getWhatToDo() method.
*/
public class TrackCoach implements Coach {
	@Override
    public void getWhatToDo() {
    	System.out.println("Run 5 Kilometers");
    	return;
    }
}
