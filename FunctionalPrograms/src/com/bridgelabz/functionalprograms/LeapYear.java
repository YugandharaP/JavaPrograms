package com.bridgelabz.functionalprograms;

import com.constantpac.utility.Utility;

public class LeapYear {
	
	public static void main(String[] args) {
			
			System.out.println("Enter the year: ");
			int year =Utility.reInteger();
			boolean result=Utility.isLeapYear(year);
			if(result==true)
			{
				System.out.println(year +" is leap year");
			}else
			{
				System.out.println(year +" is not leap year");
			}
		}
}

