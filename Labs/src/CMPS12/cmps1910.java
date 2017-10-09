package CMPS12;

import java.util.Scanner;

public class cmps1910 {
	   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      char triangleChar = '-';
		      int triangleHeight = 0;
		      
		      System.out.println("Enter a character:");
		      triangleChar = scnr.next().charAt(0);   
		      
		      System.out.println("Enter triangle height:");
		      triangleHeight = scnr.nextInt();
		      System.out.println("");
		      
		      System.out.println("*" + " ");
		      System.out.println("*" + " " + "*" + " ");
		      System.out.println("*" + " " + "*" + " " + "*" + " ");
		      
		      return;
		   }
		}
