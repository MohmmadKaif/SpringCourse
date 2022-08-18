package com.TestingSpring;
/*
 This is our BaseBall coach class.
 This class implements Coach interface.
 Thus we are overriding the getWhatToDo() method.
 */
public class BaseBallCoach implements Coach {
@Override	
public void getWhatToDo() {
	System.out.println("Do Net Practicse");
}
}
