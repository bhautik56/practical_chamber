package com.tek.sys;

public class Animation {
	InputValidationAndMaximumIteration inputValidationAndMaximumIteration = new InputValidationAndMaximumIteration();
	ParticalMovement particalMovement = new ParticalMovement();

	/*
	 * Input validation: Empty values, null and selected set of input values i.e.
	 * [R,L,.] Capture each step of partical movement till last element exit chamber
	 * 
	 */

	protected void animate(int speed, String init) {
		int no_of_iteration = inputValidationAndMaximumIteration.Input_validation_And_Maximum_iteration(speed, init);
		System.out.println("");
		System.out.println("input speed::-> " + speed + " and initial partical position::-> " + init);
		if (no_of_iteration > 0) {
			System.out.println("Partical Movement:::  -----> ");
			particalMovement.partical_movement(speed, init, no_of_iteration);
		} else {
			System.out.println("Invalid input");
		}

		System.out.println("");
	}
}
