package com.tek.sys;
class ParticalMovement {
	
	/*
	 * Capture Movement of partical w.r.t. time instance 
	 */
	protected void partical_movement(int displacement, String value, int no_of_iteration) {
	char[] val = value.toCharArray();
	char[][] _partical_movement = new char[no_of_iteration][value.length()];
	for (int i = 0; i < val.length; i++) {
	int j = i;
	if (val[i] == 'L') {
	for (int k = 0; k < _partical_movement.length; k++) {
	  if (j > 0)
	    _partical_movement[k][j] = 'X';
	  else
	    break;
	// decrement value of "j" w.r.t -> speed ;; while direction is Left
	j = j - displacement;
	}
	
	} else if (val[i] == 'R') {
	
	for (int k = 0; k < _partical_movement.length; k++) {
	if (j < _partical_movement[k].length)
	  _partical_movement[k][j] = 'X';
	else
	  break;
	// increment value of "j" w.r.t -> speed ;; while direction is Right 
	j = j + displacement;
	}
	}
	
	}
	
	// Print final result after replacing space with "."
	for (int i = 0; i < _partical_movement.length; i++) {
			System.out.println(String.valueOf(_partical_movement[i]).replace('\u0000', '.'));
	}
	}
}
