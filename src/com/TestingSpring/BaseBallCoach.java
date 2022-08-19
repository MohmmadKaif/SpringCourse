package com.TestingSpring;

import org.springframework.stereotype.Component;

/*
 This is our BaseBall coach class.
 This class implements Coach interface.
 Thus we are overriding the getWhatToDo() method.
 */
@Component("MyBaseBallCoach")
public class BaseBallCoach extends Coach {

@Override	
public void getWhatToDo() {
	System.out.println("Do Net Practicse");
}
}
