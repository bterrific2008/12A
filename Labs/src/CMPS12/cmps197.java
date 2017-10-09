package CMPS12;

import java.util.Scanner;
/*
 * Scans to convert thingys into readable phrases of proper english by returning the orignal statem
 * and then giving the converted thingys to text
 */

public class cmps197 {
	  public static void main(String[] args) {
		  @SuppressWarnings("resource")
		  // We neeed to get the input here and ask to get input
		Scanner scr = new Scanner(System.in);
	      System.out.println("Enter text:");
	      String abb = scr.nextLine();
	      //gets input and displays it for the masses
	      System.out.print("You entered: " + abb);
	      //give the converted thingys proper responses
	      System.out.println(getResponse(abb));
	      return;
	   }
	  
		public static String getResponse(String statement) {
			// Here we find what the thingy is and convert it to readable text 
			// this sends it back to the main method
			String response ="";
			if(statement.indexOf("LOL")>=0||statement.indexOf(" LOL ")>=0) {
				response = response + "\nLOL: laughing out loud";
			}if (statement.indexOf( "BFF") >= 0 ||(statement.indexOf(" BFF ") >= 0)) {
				
				response = response + "\nBFF: best friend forever";
			}if (statement.indexOf( "IDK") >= 0 ||(statement.indexOf(" IDK ") >= 0)) {
				
				response = response + "\nIDK: I don't know";
			}if (statement.indexOf( "IMHO") >= 0 ||(statement.indexOf(" IMHO ") >= 0)) {
				
				response = response + "\nIMHO: in my humble opinion";
			}if (statement.indexOf( "JK") >= 0 ||(statement.indexOf(" JK ") >= 0)) {
				
				response = response + "\nJK: just kidding";
			}if (statement.indexOf( "TMI") >= 0 ||(statement.indexOf(" TMI ") >= 0)) {
				
				response = response + "\nTMI: too much information";
		
			}if (statement.indexOf( "TTYL") >= 0 ||(statement.indexOf(" TTYL ") >= 0)) {
				
				response = response + "\nTTYL: talk to you later";		
			}
				return response; 
			}
		}
