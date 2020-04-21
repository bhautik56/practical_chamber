package com.tek.sys;

class  InputValidationAndMaximumIteration {

	/*
	 * Input validation to handle Empty, null and selected set of input values for
	 * speed and directions:
	 * + speed will be between 1 and 10 inclusive
	 * + init will contain between 1 and 50 characters inclusive
     * + each character in init will be '.' or 'L' or 'R'
     * 
	 * Post validation -> Find maximum no of iteration required to empty Chamber
	 * 
	 */
	protected int Input_validation_And_Maximum_iteration(int displacement, String value) {
		
		String value_regex = "[RL.]+";
		int no_of_itiration = 0;
		int temp = 0;

		if (value != null && Integer.toString(displacement) != null && value.matches(value_regex)
				 && !value.contains(" ") && displacement > 0 && displacement < 11 && value.length() < 51 && value.length() > 0 
				) {
			char[] val = value.toCharArray();
			for (int i = 0; i < val.length; i++) {
				if (val[i] == 'L')
					temp = ((i + 1) / displacement);
				else if (val[i] == 'R')
					temp = ((val.length - i) / displacement);
				no_of_itiration = Math.max((int) Math.ceil(temp), no_of_itiration);
			}

			return no_of_itiration + 1;

		} else {
			return 0;
		}
	}
}
