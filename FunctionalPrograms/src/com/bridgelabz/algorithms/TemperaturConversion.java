/*****************************************************************************************************************************
 *purpose-To convert temperature in Celsius and Fahrenheit  and vise versa depends upon users need
 *@author  Yuga
 *@version 1.0
 *@since   21-05-2018
 ****************************************************************************************************************************/

package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {
		System.out.println("Temparature in  1.Celsius \t 2.Fahrenheit");
		System.out.println("Enter 1 for if you want temparature in Celsius: ");
		System.out.println("Enter 2 for if you want temparature in Fahrenheit: ");
		int input = Utility.reInteger();
		double temparature = 0;
		switch (input) {
		case 1:
			System.out.println("Enter the temparature in Fahrenheit");
			double temparatureInF = Utility.readDouble();
			temparature = (temparatureInF - 32) * 5 / 9;
			System.out.println("Fahrenheit to Celsius: " + temparature + "C");
			break;
		case 2:
			System.out.println("Enter the temparature Celsius");
			double temparatureInC = Utility.readDouble();
			temparature = (temparatureInC * 9 / 5) + 32;
			System.out.println("Celsius to Fahrenheit: " + temparature + "F");
			break;
		}
	}

}
