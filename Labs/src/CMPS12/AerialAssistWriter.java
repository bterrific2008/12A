package CMPS12;

import java.util.Scanner;

public class AerialAssistWriter {
	static Scanner scr = new Scanner(System.in);

	public static void main(String args[]) {
		boolean checker = true;
		System.out.println("Enter a sample text:");
		;
		// gets input and sends it to the menu for processing
		String input = scr.nextLine();
		System.out.println("You entered: " + input + "\n");
		System.out.println(printMenu(input));
		String finale = ""; // returned statement to the main method to be printed
		// ask for the option desired
		String input2 = scr.nextLine();
		while (checker == true) {
			// handles the options by transporting them to the proper method
			if (input2.indexOf("c") >= 0) {
				finale = getNumOfNonWSCharacters(input) + "";
				System.out.print("Number of non-whitespace characters: " + finale + "\n");
				// checker = false;
			} else if (input2.indexOf("w") >= 0) {
				finale = getNumOfWords(input) +"";
				System.out.print("Number of words: " + finale + "\n");
				// checker = false;
			} else if (input2.indexOf("f") >= 0) {
				finale = findText(input) + "";
				System.out.print(finale + "\n");
				// checker = false;
			} else if (input2.indexOf("r") >= 0) {
				finale = replaceExclamation(input);
				System.out.print(finale + "\n");
				// checker = false;
			} else if (input2.indexOf("s") >= 0) {
				finale = shortenSpace(input);
				System.out.print(finale + "\n");
				// checker = false;
			} else if (input2.indexOf("q") >= 0) {
				System.out.println();
				checker = false;
			}

			if (checker == true) {
				System.out.println(printMenu(input));
				input2 = scr.nextLine();

			}

		}

	}

	public static String printMenu(String input) {
		// Lists menu options
		System.out.println("Menu\nc - Number of non-whitespace characters" + "\nw - Number of words");
		System.out.println("f - Find text");
		System.out.println("r - Replace all !'s");
		System.out.println("s - Shorten spaces");
		System.out.println("q - Quit\n");
		System.out.println("Choose an option: ");

		return "";
	}

	public static int getNumOfNonWSCharacters(String input) {
		int counter;
		// note, needs the shorten space method here to prevent errors
		input = input.replaceAll(" ", "");
		counter = input.length();
		return counter;

	}

	public static int getNumOfWords(String input) {
		int counter;
		// splits the phrase word by word to count, split at each space
		String split[] = input.split(" ");
		// gets the final amount by looking at the array length, aka. how many words
		counter = split.length;
		return counter;
	}

	public static int findText(String input) { // actually supposed to be int
		boolean founder = true;
		int counter = 0;
		int i = 0;
		// splits the words to be searched one by one, split at each space
		String split[] = input.split(" ");
		// asks for input from the user
		System.out.print("Enter a word or phrase to be found: ");
		String word = scr.nextLine();
		while (founder==true) {
			// checks if we iterated through the entire phrase yet
			if (i == split.length) {
				founder = false;
				// check if input matches any words in the statement
			} else if (split[i].equals(word + "")) {
				counter++;
			}
			i++;
		}
		return counter;
	}

	public static String replaceExclamation(String input) {
		// looked up how to use the replace method from Tutorialspoint
		input = input.replace('!', '.');
		return input;

	}

	public static String shortenSpace(String input) {
		// System.out.println("cookie");
		// String split[] = input.split(" ");
		// String fword = "";
		// for(int i = 0; i<split.leng ,th; i++) {
		// split[i] = split[i].trim();
		// fword = fword + split[i] + " ";
		// }
		// return fword;
		// used a toString method for this to work
		boolean founder = true;
		while (founder)
			if (input.indexOf("  ") >= 0) {
				input = input.replaceAll("  ", " ");
			} else if (input.indexOf("  ") <= -1) {
				founder = false;
				return input;
			}
		return input;

	}

}
