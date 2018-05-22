package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;

public class NewtonMethod {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number= Utility.reInteger();
		
		if(number>0)
		{
			double root=sqrt(number);
			System.out.println("The square root of number is :" +root);
		}
		else
		{
			try {
				throw new MyException("Only enter positive integer");
			}catch(MyException exp){
				System.err.println(exp) ;
			}
		}
	}

	private static double sqrt(int number) {
			double t=number;
			double epsilon=1e-15;
			while(Math.abs(t-number/t) > epsilon*t)
			{
				t = (number/t + t)/2;
			}
			return t;
	}

}
