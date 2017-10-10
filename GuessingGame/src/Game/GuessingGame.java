package Game;

import java.util.Scanner;

//GuessingGame.java
//Mitchell Pon
//CruzID: mjpon
//Programming Assignment 1
//A Basic calculator that figures out the final wage of the week. You must enter your hours and pay. Overtime pay is added
//on via 1.5 times the standard pay

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String inputname;
		int guess1, guess2, guess3;
		// Random number generator, doubles then goes the int
		double randNum =  0;
		randNum = (int) (Math.random() *10);
		System.out.println(randNum);
		
		// The actual game: Asks for name and ask for the guesses. Tells if you failed or not
		System.out.println("Welcome to the number guessing game. What is your honorable name?");
		inputname = scnr.nextLine();
		System.out.println("I’m thinking of an integer between 1 and 10. You have 3 guesses.");
		System.out.print(" Your first guess: ");
	}
	//checks if the number is the right guess
	public static String checker(int input, String input2, int randNum) { 
		String winning = ("Congratulations" + input2 + "! " + "You won in 2 guesses.");
		String loser1 = "Too high, guess lower.";
		String loser2 = "Too low, guess higher.";
		if(input>)
		
		return winning;
	}

}
