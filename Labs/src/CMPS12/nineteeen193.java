package CMPS12;

import java.util.Scanner;



public class nineteeen193 {
	   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      Scanner scnr2 = new Scanner(System.in);
		      int userNum = 0;
		      int userNum2 = 0;
		      int add =0;
		      int mut = 0;

		      System.out.println("Enter integer:");
		      userNum = scnr.nextInt();
		    
		      System.out.println("You entered: " + userNum);
		      System.out.println(userNum + " squared is " + (userNum*userNum));
		      System.out.println("And " + userNum +  " cubed is " + (userNum*userNum*userNum)  + "!!");

		      System.out.println("Enter another integer:");
		      userNum2 = scnr.nextInt();
		      
		      add = userNum + userNum2; 
		      mut = userNum * userNum2;
		      System.out.println(userNum + " + " + userNum2 + " is " + add);
		      System.out.println(userNum + " * " + userNum2 + " is " + mut);


		      return;
		   }
		}