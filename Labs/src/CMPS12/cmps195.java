package CMPS12;

import java.util.Scanner;

public class cmps195 {

	 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int userInt = 0;
	      double userDouble = 0.0;
	      String userChar = "b";
	      String userString = "s";
	      // FIXME Define char and string variables similarly
	      
	      System.out.println("Enter integer:");
	      userInt = scnr.nextInt();
	      System.out.println("Enter double:");
	      userDouble = scnr.nextDouble();
	      System.out.println("Enter character:");
	      userChar = scnr.next();
	      System.out.println("Enter string:");
	      userString = scnr.next();

	      System.out.println(userInt + " " + +userDouble+  " " + userChar+ " " + userString);
	      System.out.println(userString+ " " + userChar+ " " + userDouble+ " " + userInt);
	    
	      userInt = (int)(userDouble);
	      System.out.println(userDouble + " cast to an integer is " + userInt);


	      
	      return;
	   }
	}