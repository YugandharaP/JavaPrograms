package com.bridgelabz.functionalprograms;

import java.lang.Math;

public class PowerOfTwo {

	private static void powerOfTwo(int input) {
		int output = 1;
		for (int i = 0; i <= input; i++) {
			if (i == 0)
				System.out.println("2 ^ " + i + " = " + output);
			else {
				output *= 2;
				System.out.println("2 ^ " + i + " = " + output);
			}
		}

	}

	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);

		if (input>=0 && input < 31) {
			powerOfTwo(input);
		}
	}

}
