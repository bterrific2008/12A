


package Check;


//PayCheck.java
//Mitchell Pon
//CruzID: mjpon
//Programming Assignment 1
//A Basic calculator that figures out the final wage of the week. You must enter your hours and pay. Overtime pay is added
//on via 1.5 times the standard pay

import java.util.Scanner;


public class PayCheck {

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		
//Gets the input from the reader and displays it in the proper format while getting the variables needed for calculation		
		System.out.println("Please enter the total hours worked Monday through Sunday.");
		double hours = reader.nextDouble();
		System.out.println("Please enter your pay rate (in terms of USD per hour.)");
		double pay = reader.nextDouble();
		System.out.println("Your paycheck for this week is: $" + addingHours(hours,pay));
	}	
	
//Method - to calculate the hours and proper pay for the month
	public static double addingHours(double hours, double payAmount) {
		double total = 0.0; //standing variable needed to do calculations, this is where total pay will be converted
		Scanner reader =  new Scanner(System.in);
		if(hours>40) { // if there is overtime hours
			double overtime = hours - 40;
			total =  (40 * payAmount) + (overtime * payAmount * 1.5);
		}else if(hours<=40){ // overtime hour requirment is not met
			total =  (hours * payAmount);
		}
		return total;
	}
}
