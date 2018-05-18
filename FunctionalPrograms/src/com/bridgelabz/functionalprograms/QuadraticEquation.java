/***********************************************************************************************
 * purpose-
 * @author Yuga
 * @version 1.0
 * @since   18-05-2018
 */
package com.bridgelabz.functionalprograms;
import com.constantpac.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Enter bthe values for 'a' :");
		int numFirst=Utility.reInteger();
		System.out.println("Enter bthe values for 'b' :");
		int numSecond=Utility.reInteger();
		System.out.println("Enter bthe values for 'c' :");
		int numThird=Utility.reInteger();
		
		Utility.findRoots(numFirst,numSecond,numThird);
	}

}
