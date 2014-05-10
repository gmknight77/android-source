package com.bloc.loops;

import com.bloc.test.Test;

public class Loops extends Object {

	public static void main(String [] args) {
		boolean[] someBools = {true, false, true, true, false, true, false, false};
		boolean temp = false;

		// Starts here
		/*
		temp = someBools[7];
		someBools[7] = someBools[0];
		someBools[0] = temp;

		temp = someBools[6];
		someBools[6] = someBools[1];
		someBools[1] = temp;

		temp = someBools[5];
		someBools[5] = someBools[2];
		someBools[2] = temp;

		temp = someBools[4];
		someBools[4] = someBools[3];
		someBools[3] = temp;*/
		// Ends here
		/*
		int i = 0;
		int farIndex = 0;
				while (i < (someBools.length / 2)) // i < 3
        {
        	// Loop through and reverse the array
        	farIndex = someBools.length - 1 - i;
        	temp = someBools[farIndex];
        	someBools[i] = someBools[farIndex];
        	someBools[farIndex] = temp;
        */	
		int n =7;
		int d =0;
		while (n <= 7 && d <= 3) {
			temp = someBools[n];
			someBools[n] = someBools[d];
			someBools[d] = temp;
            n--;
            d++; }
		/*
		 * ASSIGNMENT:
		 * Replace the operations above with a while loop
		 */

		if (Test.testBools(someBools)) {
			System.out.print("Your booleans are in proper order!\n"); } 
			else {
			 System.out.print ("Something in the while loop…\n");
			 System.exit(0); }

		
		
		/*This is known as an in-line conditional
		 learn more here: http://www.cafeaulait.org/course/week2/43.html
        */
		 
		 //  Starts here
		    

		
        int[] numArray = new int[someBools.length];
		
		/*
		 if (!someBools[0]) { // !someBools[0]
			  numArray[0] = 1; 
		 } 
		   else {
			  numArray[0] = 0;
		 }
		*/
		
		/*
		numArray[0] = !someBools[0] ? 1 : 0;
		numArray[1] = !someBools[1] ? 1 : 0;
		numArray[2] = !someBools[2] ? 1 : 0;
		numArray[3] = !someBools[3] ? 1 : 0;
		numArray[4] = !someBools[4] ? 1 : 0;
		numArray[5] = !someBools[5] ? 1 : 0;
		numArray[6] = !someBools[6] ? 1 : 0;
		numArray[7] = !someBools[7] ? 1 : 0;
		*/
		
		//Ends here
	
		int x = 0; 
		for (x<= 7; x++) {

			numArray[x] = !someBools[x] ? 1 : 0;
		}
		/*
		 * ASSIGNMENT:
		 * Replace the operations above with a for loop
		 */

		if (Test.testInts(numArray)) {
			System.out.print("And you nailed the number array!\n"); } 
			else {
			System.out.print("Issue with the numbers…\n"); }
	}
}
