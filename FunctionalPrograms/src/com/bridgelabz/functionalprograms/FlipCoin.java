/************************************************************************
 *purpose-this function to calculate head and tail percentage after fliping a coin
 *@author Yuga
 *@version 1.0
 *@since   17-05-2018
 *****************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

/**
 * this program calculate the percentage of head and tail after fliping coin
 * @author Yuga
 *
 */
public class FlipCoin {
	static double HEAD;
	static double TAIL;
	static double PERCENTAGE_HEAD;
	static double PERCENTAGE_TAIL;


	public static void main(String[] args) {
			System.out.println("Enter the number for how many times you want to flip the coin: ");
			int chances = Utility.reInteger();
			for(int i=0;i<chances;i++) {
				if (Math.random() > 0.5)
					HEAD++;
				else
					TAIL++;
			}
			PERCENTAGE_HEAD = (HEAD / (HEAD+TAIL)) * 100;
			//PERCENTAGE_TAIL = (TAIL / (HEAD+TAIL)) * 100;
			System.out.println("Head percentage: "+PERCENTAGE_HEAD);
			System.out.println("tail percentage: "+(100-PERCENTAGE_HEAD));
		}

}
