package com.bloc.ops;

import com.libs.ops.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations extends Object {

	public static void main(String [] args) {
		int x = 18;
		/*
			ASSIGNMENT:
			Place 18 into x
		*/
		int y = ++x;
		/*
			ASSIGNMENT:
			Pre-increment x and assign it to y in a single statement
		*/
		int z = x*y;
		/*
			ASSIGNMENT:
			Multiply x by y, assign it to z
		*/
		int remainder = z%17;
		/*
			ASSIGNMENT:
			Mod z by 17 and assign the result to remainder
		*/
		float floaty = 5;
		floaty = floaty /3;
		/*
			ASSIGNMENT:
			Assign 5 to floaty and then divide it by 3
		*/
	double dubs = 5.3;
	dubs = (dubs--) * dubs;
	/*
	ASSIGNMENT:
	Assign 5.3 into dubs
	then post-Decrement dubs and multiply it by itself in a single statement
	*/

		if (!Test.testX(x)) {
			System.out.print("Sorry, looks like something's wrong with 'x'\n");
		} else if (!Test.testY(y)) {
			System.out.print("Sorry, looks like something's wrong with 'y'\n");
		} else if (!Test.testZ(z)) {
			System.out.print("Sorry, looks like something's wrong with 'z'\n");
		} else if (!Test.testRemainder(remainder)) {
			System.out.print("Sorry, looks like something's wrong with 'remainder'\n");
		} else if (!Test.testFloat(floaty)) {
			System.out.print("Sorry, looks like something's wrong with 'floaty'\n");
		} else if (!Test.testDouble(dubs)) {
			System.out.print("Sorry, looks like something's wrong with 'dubs'\n");
		} else {
			System.out.print("Congratulations! Everything works!\n");
		}
	}
}
