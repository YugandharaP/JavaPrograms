
/***************************************************************************************************************
 * purpose-To measure the time elapsed between start time and end time.
 * @author Yuga
 * @version 1.0
 * @since   18-05-2018
 *
 ***************************************************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		System.out.println("Enter 0 for start the stopwatch");
		int input = Utility.reInteger();
		long startTime = 0;  //store startTime
		long stopTime = 0;	//store stopTime
		int flag = 0;
		while (flag == 0) {
			switch (input) {
			case 0:
				startTime = System.nanoTime();  //nonoTime() is measuerd current time of system
				System.out.println("Enter 1 to stop the stopWatch");
				input = Utility.reInteger();
				break;
			case 1:
				stopTime = System.nanoTime();
				flag = 1;
			}
		}
		System.out.println("Start Time = " + startTime);
		System.out.println("Stop Time = " + stopTime);
		System.out.println("Elapsed Time = " + (stopTime - startTime) + " ns");
	}

}
