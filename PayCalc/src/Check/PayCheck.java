package Check;

import java.util.Scanner;

//file_name.java
//Mitchell Pon
//your CruzID
//Pay
//a (very) short description of the program

public class PayCheck {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		boolean valid = true;
		
		while(valid==true) {
		System.out.println("Please enter the total hours worked Monday through Sunday.");
		int u = reader.nextInt();
		System.out.println("Please enter your pay rate (in terms of USD per hour.");
		double n = reader.nextDouble();
		System.out.println("Your paycheck for this week is:" + addingHours(u,n));
		}
	}}
		
	public static double addingHours(int hours, double payAmount) {
		double total;
		Scanner reader =  new Scanner(System.in);
		if(hours>40) {
			int overtime = hours - 40;
			System.out.println("What is your overtime pay?");
			double ovTimPay = reader.nextDouble();
			total =  (40 * payAmount) + (overtime * ovTimPay);
		}else if(hours = ){
			
			
	}
	}
