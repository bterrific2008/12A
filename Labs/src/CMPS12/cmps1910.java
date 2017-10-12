package CMPS12;

import java.util.Scanner;

/*
 * The goal of the program is to create a right triangle out of the character and size given by the user
 * 
 * 
 * 
 * 
 */

import java.util.Scanner; 

public class cmps1910 {
	   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      char triangleChar = '-';
		      int triangleHeight = 0;
		      int i; // changes to the next line
		      
		      System.out.println("Enter a character:"); //gets the character you want for the triangle
		      triangleChar = scnr.next().charAt(0);   
		      
		      System.out.println("Enter triangle height:"); //gets the triangle height
		      triangleHeight = scnr.nextInt();
		      System.out.print(""); 
		      
		for(i = 0; i < triangleHeight; i++) { //iterates to the next line
			System.out.println();
			for(int j = 0; j <= i; j++) { //putting in characters in every line
				System.out.print(triangleChar + " ");
			}
	   } 	System.out.println(); // for freaking whitespace requirements.....
	   return;
	}
}
