/*Purpose: Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal.
* Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results,
* and prints them out.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
*  @author  Yuga
*  @version 1.0
*  @since   17-05-2018
**/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
	//taking user inputs
	System.out.println("Enter $Stake value: ");
	int $stake=Utility.reInteger();
	System.out.println("Enter $Goal value: ");
	int $goal=Utility.reInteger();
	System.out.println("Enter NoOfTimes to play");
	int noOfTimes=Utility.reInteger();
	
	Utility.isWinOrLoss($stake,$goal,noOfTimes);
	
	}

}
