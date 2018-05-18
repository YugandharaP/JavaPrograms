package com.bridgelabz.functionalprograms;

import com.constantpac.utility.Utility;

public class ReplaceString {

	public static void main(String[] args) {

		System.out.println("Enter Username: ");
		String username = Utility.retNext();
		System.out.println(Utility.replaceString(username));

	}

}
