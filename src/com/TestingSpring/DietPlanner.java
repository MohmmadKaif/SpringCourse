package com.TestingSpring;

import org.springframework.stereotype.Component;

/*
 * Here we have created a new class named DietPlanner.
 * This class is acting as a dependency for all Coach classes.
 * Now we have to declare this class as component in order to declare this class as bean.
 * And this is how we do it using @Component. Inside bracket we have given the name
*/

@Component("MyDietPlanner")
public class DietPlanner {
   public void PlanMyDiet() {
		System.out.println("Reduce carbohydrates consumption and increase the protein and fat consuption...");
	}
	
}
