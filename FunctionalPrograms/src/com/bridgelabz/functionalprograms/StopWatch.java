package com.bridgelabz.functionalprograms;

import com.constantpac.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("Enter 0 for start the stopwatch");
		int input=Utility.reInteger();
		long startTime = Utility.readLong();
		long stopTime=Utility.readLong();
		int flag=0;
		while(flag==0)
		{
			switch(input)
			{
			case 1 : 
				startTime=System.nanoTime();
				System.out.println("Enter 0 to stop the stopWatch");
				input=Utility.reInteger();
				break;
				
			case 2 :
				stopTime=System.nanoTime();
				flag=1;
			}
		}

	}

}
