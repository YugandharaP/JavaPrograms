
package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author adminsitrator
 *
 */
public class Utility {

	static Scanner scn = new Scanner(System.in);
	// For Inputting a only one String
	public static String retNext() {
		return scn.next();
	}

	// For Inputting multiple Strings
	public static String retNextLine() {
		return scn.nextLine();
	}

	// For Inputting Integer
	public static int reInteger() {
		return scn.nextInt();
	}

	/**
	 * @return double number
	 */
	public static double readDouble() {
		return scn.nextDouble();
	}

	/**
	 * @return boolean number
	 */
	private static boolean readBoolean() {
		return scn.nextBoolean();
	}

	/**
	 * @return
	 */
	public static long readLong() {
		return scn.nextLong();
	}

	/*
	 * this function replace the template string with user input name
	 * 
	 * @param String - the string to replace the existing string with username
	 * 
	 * @return the modified template string
	 */

	public static String replaceString(String username) {
		String template = "Hello <<username>>, How are you?";
		String output = "";
		if (username.length() < 3) {
			System.out.println("username should contain minimum three character atleast !");
		} else {
			output = template.replaceAll("<<username>>", username);
		}
		return output;
	}

	/*
	 * this function to check user input year leap year or not
	 * 
	 * @param number- the year will check leap year or not
	 * 
	 * @return the boolean decision for leap year or not
	 */
	public static boolean isLeapYear(int year) {
		if (year > 999 && year < 10000) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				return true;
			} else
				return false;
		} else
			return false;

	}

	/*
	 * This function is print to the prime factor of user input number
	 * 
	 * @param number-to take number ,which we have to find prime factors
	 * 
	 * @return HashSet to gives unique prime factors
	 */

	public static HashSet isprimeFactor(int input) {
		HashSet list = new HashSet();
		while (input % 2 == 0) {
			list.add(2);
			input /= 2;
		}
		for (int i = 3; i < Math.sqrt(input); i = i + 2) {
			while (input % i == 0) {
				list.add(i);
				input /= i;
			}
		}
		if (input > 2) {
			list.add(input);
		}
		return list;
	}

	/*
	 * This function for gambling or betting which to find user will loose or win
	 * 
	 * @param number-to takes numbers from user for set goal,amount and timeOfNumber
	 * Print the result for win or loss percentage and number of time win out of
	 * total chances
	 */
	public static void isWinOrLoss(int $stake, int $goal, int noOfTimes) {

		int win = 0;
		int loss = 0;

		for (int i = 0; i <= noOfTimes; i++) {
			while ($stake > 0 && $stake < $goal) {
				if (Math.random() > 0.5) {
					$stake += 1;// win $1
					win++;
					break;
				} else {
					$stake -= 1; // lose $1
					loss++;
					break;
				}
			}
		}
		// print results
		System.out.println(win + " win of " + noOfTimes);
		if ($stake == $goal) {
			System.out.println("you are reach the goal");
		}
		System.out.println("percentage of win : " + (win * 100) / (win + loss) + " %");
		System.out.println("percentage of loose : " + (loss * 100) / (win + loss) + " %");
	}

	/**
	 * this function for 2D arrays of integers and doubles and boolean from standard
	 * input and printing them out to standard output.
	 * 
	 * @param number
	 *            to take input number to choose the options
	 */
	public static void twoDArray(int input) {

		switch (input) {
		case 1:

			System.out.println("Enter Number of rows");
			int rows = Utility.reInteger();
			System.out.println("Enter Number of columns");
			int colmn = Utility.reInteger();
			int[][] arrayInt = new int[rows][colmn];
			System.out.println("Enter the elements for rows and colms: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < colmn; j++) {
					arrayInt[i][j] = reInteger();
				}
			}

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < colmn; j++) {
					System.out.print(arrayInt[i][j] + " ");
				}
				System.out.println();
			}

			break;

		case 2:

			System.out.println("Enter Number of rows");
			int rowsD = Utility.reInteger();
			System.out.println("Enter Number of colmn");
			int colmnD = Utility.reInteger();
			double[][] arrayDouble = new double[rowsD][colmnD];
			System.out.println("Enter the elements for rows and colms: ");
			for (int i = 0; i < rowsD; i++) {
				for (int j = 0; j < colmnD; j++) {
					arrayDouble[i][j] = readDouble();
				}
			}

			for (int i = 0; i < rowsD; i++) {
				for (int j = 0; j < colmnD; j++) {
					System.out.println(arrayDouble[i][j] + " ");
				}
				System.out.println();
			}
			break;

		case 3:
			System.out.println("Enter Number of rows");
			int rowsB = Utility.reInteger();
			System.out.println("Enter Number of colmn");
			int colmnB = Utility.reInteger();
			boolean[][] arrayBoolean = new boolean[rowsB][colmnB];
			System.out.println("Enter the elements for rows and colms: ");
			for (int i = 0; i < rowsB; i++) {
				for (int j = 0; j < colmnB; j++) {
					arrayBoolean[i][j] = readBoolean();
				}
			}
			for (int i = 0; i < rowsB; i++) {
				for (int j = 0; j < colmnB; j++) {
					System.out.print(arrayBoolean[i][j] + " ");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("wrong input !");
		}

	}

	/**
	 * this function generate random number until we get distinct coupon number
	 * 
	 * @param couponNumber
	 *            is to take the value for how many digits distinct coupon number he
	 *            want
	 * @return count value that how many times random number generated
	 */
	public static int couponGenerator(int couponNumber) {
		List<Integer> list = new ArrayList<>(couponNumber);
		Random random = new Random();
		int count = 0;
		int distinctValue = 0;
		int index = 0;
		while (couponNumber > index) {
			distinctValue = random.nextInt(10);
			count++;
			if (list.contains(distinctValue)) {
				continue;

			} else
				list.add(distinctValue);
			index++;

		}
		return count;
	}

	/**
	 * this function calculate euclideanDistance using the inbuild function
	 * math.pow() and math.sqrt()
	 * 
	 * @param firstNumber
	 *            for first value
	 * @param secondNumber
	 *            for second value
	 */
	public static void euclideanDistance(int firstNumber, int secondNumber) {
		double distance = 0;
		distance = Math.sqrt(Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2));
		System.out.println("the EuclideanDistance between " + firstNumber + " and " + secondNumber + " is " + distance);
	}

	/**
	 * this function is find the weather temparature is to be windchill
	 * 
	 * @param temparature
	 * @param speed
	 */
	public static void calculateWindChill(double temparature, double speed) {
		double weather = 35.74 + (0.6215 * temparature) + ((0.4275 * temparature - 35.75) * Math.pow(speed, 0.16));
		System.out
				.println("National Weather Service defines the effective temperature the wind chill to be: " + weather);
	}

	/**
	 * this function check the number is prime or not
	 * 
	 * @param num-which
	 *            is to be check
	 * @return true or false after checking prime number
	 */
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++)
		{
		if (num%i == 0)
			return false;
		}
		return true;
	}

	/**
	 * Bubble method to sort elements of integer type
	 * 
	 * @param array-taking
	 *            array to which sort
	 */
	public static void bubbleSortForInteger(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * Bubble method to sort elements of Character type type
	 * 
	 * @param array-taking
	 *            array to which sort
	 */
	public static void bubbleSortForCharacter(char[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char empty = arr[i];
					arr[i] = arr[j];
					arr[j] = empty;
				}
			}
		}
	}

	/**
	 * this function sort the string alphabetically using bubble sort algorithm
	 * @param string -the string to be sort
	 * @return temp- sorted string
	 */
	public static String sort(String string) {
		char[] arr = string.toCharArray();
		String temp = "";
		Utility.bubbleSortForCharacter(arr);
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
		}
		return temp;
	}
	
	/**
	 * This function sort the string at the time of insertion
	 * 
	 * @param array-take
	 *            unsorted array
	 * @return array-return sorted array
	 */
	public static String[] insertionSortOfStrings(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String peak = array[i];
			int temp = i - 1;
			while (temp >= 0 && peak.compareToIgnoreCase(array[temp]) < 0) {
				array[temp + 1] = array[temp];
				temp--;
			}
			array[temp + 1] = peak;

		}
		return array;
	}

	/**
	 * This function sort the string at the time of insertion
	 * 
	 * @param array-take
	 *            unsorted array
	 * @return array-return sorted array
	 */
	public static int[] insertionSortOfInteger(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int peak = array[i];
			int temp = i - 1;
			while ((temp >= 0) && (array[temp] > peak)) {
				array[temp + 1] = array[temp];
				temp--;
			}
			array[temp + 1] = peak;
		}
		return array;
	}

	/**This function search the Integers based on users demand
	 * @param array
	 * @param element index
	 */
	public static int binarySearchForInteger(int[] array, int searchWord) {
		int low = 0;
		int high = array.length - 1;
		int mid=0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid]<searchWord) {
				low = mid + 1;
				
			} else if (array[mid]>searchWord) {
				high = mid - 1;
			} else 
			{
				return mid;
			}
		}
		return -1;
	}
	
	/**This function search the Strings based on users demand
	 * @param array,searchWord
	 * @param word index 
	 */
	public static int binarySearchForStrings(String[] array, String searchWord) {
		int low = 0;
		int high = array.length - 1;
		int mid=0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid].compareToIgnoreCase(searchWord)>0) {
				low = mid + 1;
			} else if (array[mid].compareToIgnoreCase(searchWord)<0) {
				high = mid - 1;
			} else 
			{
				return mid;
			}
		}
		return -1;
	}

	/**
	 * this function calculate elapsed time between start and stop watch
	 */
	public static void stopWatch() {
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

	public static void readArray(int input) {
		
	}

}
