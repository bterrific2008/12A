package Cookie;

import java.util.Arrays;

public class makeArrayConsecutive2 {
	
	public static void main(String args[]) {
		int[] array = {3,6};
		System.out.println(makeArrayConsecutive2(array));
		
	}

	public static int makeArrayConsecutive2(int[] statues) {
	    int counter = 0; // counts how many statues are needed to fill in
	   Arrays.sort(statues); //sorts the statues into the order needed
	    int j =0; //marker in the array
	    int highVal = statues[statues.length-1];
	    int a = statues[0]; //grabs and starts out with the first number of array
	    for(int i = 0; i < highVal; i++) {
	    	if(i<j) {
	    		j++;
	    	}
	        if(a!=statues[j]){ //checks to see if the statue is missing from sorted pack
	            a = statues[j];
	            counter++;
	        }
	    }
	return counter;

	}
}
