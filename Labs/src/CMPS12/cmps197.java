package CMPS12;

import java.util.Scanner;
/*
 * Scans to convert thingys into readable phrases of proper english
 */

public class cmps197 {
	  public static void main(String[] args) {
		  @SuppressWarnings("resource")
		  // We neeed to get the input here and ask to get input
		Scanner scr = new Scanner(System.in);
	      System.out.println("Input an abbreviation:");
	      String abb = scr.nextLine();
	      //gets input and sends it to the getResponse method
	      System.out.println(getResponse(abb));
	      return;
	   }
	  
		public static String getResponse(String statement) {
			// Here we find what the thingy is and convert it to readable text 
			// this sends it back to the main method
			if(statement.indexOf("LOL")>=0||statement.indexOf(" LOL ")>=0) {
				return "laughing out loud";
			}else if (statement.indexOf( "BFF") >= 0 ||(statement.indexOf(" BFF ") >= 0)) {
				return "best friends forever";
			}else if (statement.indexOf( "IDK") >= 0 ||(statement.indexOf(" IDK ") >= 0)) {
				return "I don't know";
			}else if (statement.indexOf( "IMHO") >= 0 ||(statement.indexOf(" IMHO ") >= 0)) {
				return "in my humble opinion";
			}else if (statement.indexOf( "TMI") >= 0 ||(statement.indexOf(" TMI ") >= 0)) {
				return "too much information";
			}else {
				return "Unknown";
			}
		}
}