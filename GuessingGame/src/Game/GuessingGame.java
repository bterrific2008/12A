package Game;

import java.util.Scanner;

//GuessingGame.java
//Mitchell Pon
//CruzID: mjpon
//Programming Assignment 2 - GuessingGame
// This is a number guessing game which ask for three guesses. Failure to get the guess will result in an angry reply
//success will be granted a congrats

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputname;
		int guess1;
		boolean keepGoing = true;
		// Random number generator, doubles then goes the int
		int randNum =  0;
		randNum = (int) (Math.random() *10);
		
		// The actual game: Asks for name and ask for the guesses. Tells if you failed or not
		System.out.println("Welcome to the number guessing game. What is your honorable name?");
		inputname = scnr.nextLine();
		System.out.println("I’m thinking of an integer between 1 and 10. You have 3 guesses.");
		
		int i = 0;
		// holds the modified text to display to the user when interacting
		String winning;
		String[] numGuess= {"first", "second", "third"};
		
		
		//loop checks if the number is the right guess	
		while(keepGoing) {
			winning = ("Congratulations " + inputname + "! " + "You won in "+ (i+1) + " guesses.");
			System.out.println("Your " + numGuess[i] +" guess: ");
			guess1 = (int) scnr.nextDouble();
			//kills the loop if you lost
			if(guess1==randNum) {
				System.out.println(winning);
				keepGoing = false; //kills the loop if you won
			} else if (numGuess[i].equals("third"))  {
				keepGoing = false; 
				System.out.println("Game over "+ inputname + " , you lose.");
			//number is too high
			} else if(guess1<randNum) { 
				System.out.println("Too low, guess higher.");
			//if the number is too low
			} else if(guess1>randNum) { 
				System.out.println("Too high, guess lower.");
			// if you WON BIG
			} else {
				System.out.println(winning);
				keepGoing = false; //kills the loop if you won
			}
			// keeps on iterating to the next guess :P
			i++;	
			
		}
	}


}