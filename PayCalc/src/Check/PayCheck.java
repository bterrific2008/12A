//PayCheck.java
//Mitchell Pon
//ID: 1591702
//Programming Assignment 1
// A Basic calculator that figures out the final wage of the week. You must enter your hours and pay. Overtime pay is added
// on via 1.5 times the standard pay



package Check;

import java.util.Scanner;


public class PayCheck {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		boolean valid = true;

		System.out.println("Please enter the total hours worked Monday through Sunday.");
		double hours = reader.nextDouble();
		System.out.println("Please enter your pay rate (in terms of USD per hour.)");
		double pay = reader.nextDouble();
		System.out.println("Your paycheck for this week is: $" + addingHours(hours,pay));
	}	
	public static double addingHours(double hours, double payAmount) {
		double total = 0.0;
		Scanner reader =  new Scanner(System.in);
		if(hours>40) {
			double overtime = hours - 40;
			total =  (40 * payAmount) + (overtime * payAmount * 1.5);
		}else if(hours<=40){
			total =  (40 * payAmount);
		}
		return total;
	}
}
