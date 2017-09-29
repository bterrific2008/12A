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
		String hours = reader.next();
		double u = Double.parseDouble(hours);
		System.out.println("Please enter your pay rate (in terms of USD per hour.)");
		String pay = reader.next();
		double n = Double.parseDouble(pay);
		System.out.println("Your paycheck for this week is: $" + addingHours(u,n));
		}
	}	
	public static double addingHours(double hours, double payAmount) {
		double total = 0.0;
		Scanner reader =  new Scanner(System.in);
		if(hours>40) {
			double overtime = hours - 40;
			System.out.println("What is your overtime pay?");
			double ovTimPay = reader.nextDouble();
			total =  (40 * payAmount) + (overtime * ovTimPay);
		}else if(hours<=40){
			total =  (40 * payAmount);
		}
		return total;
	}
	public static String checker(String input) {
		if(input.)
	}
