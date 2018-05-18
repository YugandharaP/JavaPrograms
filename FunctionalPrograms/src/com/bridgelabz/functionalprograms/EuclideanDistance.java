package com.bridgelabz.functionalprograms;

import com.constantpac.utility.Utility;

/**
 * purpose-this class to calculate Euclidean distance from the point (x, y) to the origin (0, 0)
 * using the formula distance = sqrt(x*x + y*y). 
 * Use Math.power function
 *@author Yuga
 *@version 1.0
 *@since   18-05-2018
 */
public class EuclideanDistance {

	public static void main(String[] args) {
		int firstNumber=Integer.parseInt(args[0]);
		int secondNumber=Integer.parseInt(args[1]);
		Utility.euclideanDistance(firstNumber,secondNumber);

	}

}
