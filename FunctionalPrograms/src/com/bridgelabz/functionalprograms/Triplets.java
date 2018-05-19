
/*************************************************************************************************************
 *purpose-Reads in N integers and counts the number of triples that sum to exactly 0. 
 * @author Yuga
 * @version 1.0
 * @since   18-05-2018
 *************************************************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Triplets {

	static int SUM = 0;
	static int count = 0;

	public static void main(String[] args) {
		System.out.println("Enter the size of array  : ");
		int size = Utility.reInteger();
		System.out.println("Enter the elements for array: ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + (i + 1) + " Value :");
			array[i] = Utility.reInteger();
		}
		checkTriplets(array, size);
		System.out.println("count is = " + count);
	}

	/**
	 * @param array
	 *            that stores the elements
	 * @param size
	 *            is the length of array
	 * @return count which counted how many triplets having sum zero
	 */
	private static int checkTriplets(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					SUM = array[i] + array[j] + array[k];
					if (SUM == 0) {
						System.out.println("Sum of " + (count + 1) + " triplet [" + array[i] + " " + array[j] + " "
								+ array[k] + " ] is =" + SUM);
						count++;
					}

				}

			}
		}
		return count;
	}

}
