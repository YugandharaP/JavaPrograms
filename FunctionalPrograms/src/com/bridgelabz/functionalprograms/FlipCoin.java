package com.bridgelabz.functionalprograms;

import java.util.Scanner;
import com.constantpac.utility.Utility;

public class FlipCoin {
	static double HEAD;
	static double TAIL;
	static double PERCENTAGE;

	public static void main(String[] args) {
			System.out.println("Enter the number for how many times you want to flip the coin: ");
			int chances = Utility.reInteger();
			
			if (chances > 0) {
				if (Math.random() > 0.5)
					HEAD++;
				else
					TAIL++;

				PERCENTAGE = (HEAD / chances) * 100;
				System.out.println(PERCENTAGE);
				return;
			} else
				System.out.println("Enter only positive integer");
		}

}
