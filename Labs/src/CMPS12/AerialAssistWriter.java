package CMPS12;

import java.util.Scanner;

public class AerialAssistWriter {
	static Scanner scr = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter a sample text:");;
		String input = scr.nextLine();
		System.out.println(printMenu(input));
	}
	
	public static String printMenu(String input) {
		System.out.println("Menu \n c - Number of non-whitespace characters\r\n" + "\n w - Number of words ");
		System.out.println("f - Find text ");
		System.out.println("r - Replace all !'s ");
		System.out.println("s - Shorten spaces\r\n");
		System.out.println("q - Quit\r\n");
		System.out.println("Choose an option: ");
		String finale = "";
		String input2 = scr.nextLine();	
		if(input2.indexOf("c")>=0) {
			finale = getNumOfNonWSCharacters(input);
			return finale;
		} else if (input2.indexOf("w")>=0) {
			finale = getNumOfWords(input);
			return finale;	
		} else if (input2.indexOf("f")>=0) {
			finale = findText(input);
			return finale;
		} else if (input2.indexOf("r")>=0) {
			finale = replaceExtension(input);
			return finale;
		} else if (input2.indexOf("s")>=0) {
			finale = shortenSpace(input);
			return finale;
		} else if (input2.indexOf("q")>=0) {
			finale = getNumOfNonWSCharacters(input);
			return finale;			
			
		}
		
		
		return "";
	}
	
	public static String getNumOfNonWSCharacters(String input) {
		int counter;
		// note, needs the shorten space method here to prevent errors
		String split[] = input.split("");
		counter  = split.length;
		return counter + "";
		
	}
	
	public static String getNumOfWords(String input) {
		int counter;
		String split[] = input.split(" ");
		counter  = split.length;
		return counter + "";
	}
	
	public static String findText(String input) { //actually supposed to be int
		boolean founder  = true;
		int counter = 0;
		int i = 0;
		String split[] = input.split(" ");
		while(founder) {
			if(split[counter].equals("")) { //add the input here
				counter++;
			} else if(i == split.length) {
				
			} i++;
		}
		
		return counter + "";
	}
	
	public static String replaceExtension(String input) {
		return "";
	}
	
	public static String shortenSpace(String input) {
		return "";
	}
	
}
