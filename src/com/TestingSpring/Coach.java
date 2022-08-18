package com.TestingSpring;

/*
This is our Coach interface.
It has a abstract method method getWhatToDo(). 
*/
public interface Coach {
public void getWhatToDo();
//Here I have created one more method which the child class will implement.
public void getDietPlannerConsultation();
}
