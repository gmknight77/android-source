package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

// EDIT BELOW

	public static void main(String [] args) {
		int magicNumber= WorstPractices.animals(false);
		magicNumber *= 5;
		if (magicNumber > 18){
			while(magicNumber > 0){
				  magicNumber--;
			}
		}
	}


/* 
	animals
	this method takes in a single parameter, theThing. 
	using a very elaborate and complex algorithm. 
	it calculate a magic number
 	thething: a seed which helps generate the magic number
 	returns: a magical number
*/

	private static int animals(boolean theThing){
			
		// Start off with one of these

			int ant = theThing ? 34 : 21;
			float sparklesFairy = .5f;
			for (int brown = 0; brown < ant; brown++){ 
				 sparklesFairy *= ant;
			} 
			return (int) sparklesFairy * ant;
	}

// STOP EDITING
}