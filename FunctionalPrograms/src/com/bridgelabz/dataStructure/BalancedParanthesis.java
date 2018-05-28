package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class BalancedParanthesis<T> {

	public static void main(String[] args) {
		System.out.println("Enter Expression :  ");
		String expression = Utility.retNextLine();
		Boolean condition = checkValidExpression(expression);
		if (condition == true) {
			System.out.println("Your expression is Balanced");
		} else
			System.out.println("Your expression is not Balanced");
	}

	public static <T> boolean checkValidExpression(String expression) {

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
				MyStack.push(expression.charAt(i));
			} 
			else {
				if (MyStack.isEmpty()) {
					return false;
				}
				switch (expression.charAt(i)) {
				case ')':
					if (MyStack.peak().equals('(')) {
						MyStack.pop();
						continue;
					} else
						return false;
				case '}':
					if (MyStack.peak().equals('{')) {
						MyStack.pop();
						continue;
					} else
						return false;
				case ']':
					if (MyStack.peak().equals('[')) {
						MyStack.pop();
						continue;
					} else
						return false;
				}
			}
		}
		return true;
	}

}
