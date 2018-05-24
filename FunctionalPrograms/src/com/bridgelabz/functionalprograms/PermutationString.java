/**Purpose: This will return all permutation of a String using iterative method and
Recursion method.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
*  @author  Yuga
*  @version 1.0
*  @since   19-05-2018
*/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class PermutationString {
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		String inputString = Utility.retNext();
		permutation(inputString);
	}

	private static void permutation(String inputString) {
		String permute="";
		permutationString(permute,inputString);
		
	}

	private static void permutationString(String permute, String inputString) {
		if (inputString.length() == 0) {
			System.out.println(permute);
		} else {
			for (int i = 0; i < inputString.length(); i++) {
				permutationString(permute + inputString.charAt(i),inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
		}
	}
}
