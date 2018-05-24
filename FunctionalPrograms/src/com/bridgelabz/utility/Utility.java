/**purpose-this contain multiple methods which will call  many time in multiple program.
 * @author Yuga
 *@version 1.0
 *@since   17-05-2018
 */
package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.bridgelabz.Algorithms.MyException;

public class Utility {

	static Scanner scn = new Scanner(System.in);

	/**
	 * @return single String number
	 */
	public static String retNext() {
		return scn.next();
	}

	/**
	 * @return Multiple String number
	 */
	public static String retNextLine() {
		return scn.nextLine();
	}

	/**
	 * @return Integer number
	 */
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
	public static boolean readBoolean() {
		return scn.nextBoolean();
	}

	/**
	 * @return long number
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
	 * @param number- the year will check leap year or not
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
	 * @param number-to take number ,which we have to find prime factors
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
	 * @param number-to takes numbers from user for set goal,amount and timeOfNumber
	 * Print the result for win or loss percentage and number of time win out of
	 * total chances
	 */
	public static void isWinOrLoss(int $stake, int $goal, int noOfTimes) {
		int win = 0;
		int loss = 0;
		for (int i = 0; i < noOfTimes; i++) {
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
	 * @param number -to take input number to choose the options
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
	 * @param couponNumber is to take the value for how many digits distinct coupon number he want
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
	 * this function calculate euclideanDistance using the inbuild function  math.pow() and math.sqrt()
	 * @param firstNumber for first value
	 * @param secondNumber for second value
	 */
	public static void euclideanDistance(int firstNumber, int secondNumber) {
		double distance = 0;
		distance = Math.sqrt(Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2));
		System.out.println("the EuclideanDistance between " + firstNumber + " and " + secondNumber + " is " + distance);
	}

	/**
	 * this function is find the weather temparature is to be windchill
	 * @param temparature
	 * @param speed
	 */
	public static void calculateWindChill(double temparature, double speed) {
		double weather = 35.74 + (0.6215 * temparature) + ((0.4275 * temparature - 35.75) * Math.pow(speed, 0.16));
		System.out.println("National Weather Service defines the effective temperature the wind chill to be: " + weather);
	}

	/**
	 * this function check the number is prime or not
	 * @param num-which is to be check
	 * @return true or false after checking prime number
	 */
	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * Bubble method to sort elements of integer type
	 * @param array-taking array to which sort
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j])>0) {
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	/**
	 * This function sort the generic type of array at the time of insertion
	 * @param array-take unsorted array
	 * @return array-return sorted array
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			T peak ;
			peak = array[i];
			int temp = i - 1;
			while (temp >= 0 && peak.compareTo(array[temp]) < 0) {
				array[temp + 1] = array[temp];
				temp--;
			}
			array[temp + 1] = peak;
		}
	}
	/**
	 * This function search the the generic element based on users demand
	 * @param array,searchWord
	 * @param word index
	 */
	public static <T extends Comparable<T>>int binarySearch(T[] array, T searchWord1) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid].compareTo(searchWord1) < 0) {
				low = mid + 1;
			} else if (array[mid].compareTo(searchWord1) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	/**This function used to print generic array
	 */
	public static <T> void printArray(T[] array) {
		String print = "";
		for (int i = 0; i < array.length; i++) {
			print += array[i] + " ";
		}
		System.out.println("Elements after sort : " + print);
	}

	/**
	 * this function calculate elapsed time between start and stop watch
	 */
	public static void stopWatch() {
		System.out.println("Enter 0 for start the stopwatch");
		int input = Utility.reInteger();
		long startTime = 0; // store startTime
		long stopTime = 0; // store stopTime
		int flag = 0;
		while (flag == 0) {
			switch (input) {
			case 0:
				startTime = System.nanoTime(); // nonoTime() is measuerd current time of system
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

	/**
	 * this function calculate minimum notes of given money using recursion
	 */
	public static int calculatingNotes(int money, int index) {
		int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int noteCount = 0;
		if (money == 0) {
			return -1;
		} else {
			if (money >= notes[index]) {
				noteCount = money / notes[index];
				int rem = money % notes[index];
				money = rem;
				System.out.println(notes[index] + "notes = " + noteCount);
			} else
				index++;
			calculatingNotes(money, index);
		}
		return 0;
	}

	/** Calculate year month and day and return back the day number */
	public static int dayOfWeek(int month, int day, int year) {
		System.out.println("entered date is " + month + "/" + day + "/" + year);
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/** This function check input date is valid or not */
	public static boolean isValidDate(int month, int date, int year) {
		if (month < 1 || month > 12)
			return false;
		if (date < 1 || date > 31)
			return false;
		if (month == 2) {
			if (Utility.isLeapYear(year))
				return (date <= 29);
			else
				return (date <= 28);
		}
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return (date <= 30);
		return true;
	}

	/**This function divide the array elements into single cell
	 */
	public static void mergeSort(String[] array, int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}
	}
	/**This function merge the array after comparing the strings
	 */
	public static void merge(String array[], int low, int mid, int high) {
		int i, mid1, k = 0, low1;
		String[] temp = new String[50];
		low1 = low;
		i = low;
		mid1 = mid + 1;
		while ((low1 <= mid) && (mid1 <= high)) {
			if (array[low1].compareToIgnoreCase(array[mid1]) <= 0) {
				temp[i] = array[low1];
				low1++;
			} else {
				temp[i] = array[mid1];
				mid1++;
			}
			i++;
		}
		if (low1 > mid) {
			for (k = mid1; k <= high; k++) {
				temp[i] = array[k];
				i++;
			}
		} else {
			for (k = low1; k <= mid; k++) {
				temp[i] = array[k];
				i++;
			}
		}
		for (k = low; k <= high; k++) {
			array[k] = temp[k];
		}
	}

	/**this function convert decimal to binary
	 * @param decimalNum-take decimal number
	 */
	public static String toBinary(int decimalNum) {
		String remainder="";
		String binary="";
		int length=0;
		while(decimalNum>0)
		{
			remainder+=decimalNum%2;
			decimalNum/=2;
		}
		length=checklength(remainder);
		
		for(int i=0;i<length;i++)
		{
			remainder+='0';
		}
		for(int i=remainder.length()-1;i>=0;i--)
		{
			binary+=remainder.charAt(i);
		}
		return binary;
	}

	/**this function check the length and return the length
	 * @param remainder
	 * @return length
	 */
	private static int checklength(String remainder) {
		int length=0;
		 if(remainder.length()>0 && remainder.length()<8) 
		return length=8-remainder.length();
		return length;
	}

	/**This function swap old binary nibble and return new binary number
	 */
	public static String swapNibble(String binary) {
		int length=binary.length();
		String nibble1="";
		String nibble2="";
		String newBinary="";
		for(int i=0;i<length/2;i++)
		{
			nibble1+=binary.charAt(i);
			//System.out.println(nibble1);
		}
		for(int i=length/2;i<length;i++)
		{
			nibble2+=binary.charAt(i);
			//System.out.println(nibble2);
		}
		String temp=nibble1;nibble1=nibble2;nibble2=temp;
		newBinary=nibble1+nibble2;
		return newBinary;
	}

	/**
	 * this function convert binary number to decimal number
	 */
	public static int toDecimal(String newBinary) {
		int length=newBinary.length();
		int newDecimal=0;int index=0;
		for(int i= length-1;i>=0;i--)
		{
			if(newBinary.charAt(i)=='1')
			{
				newDecimal+=(int) checkPower(index);
			}
			index++;
		}
		return newDecimal;
	}

	/**
	 * this function calculate  the power of two and return
	 */
	private static double checkPower(int index) {
		double temp=Math.pow(2, index);
		return temp;
	}

	public static String sort(String string1) {
		char[]array=string1.toCharArray();
		String result="";
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					char temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			result+=array[i];
		}
		return result;
	}

	

		
	
	
	}	
