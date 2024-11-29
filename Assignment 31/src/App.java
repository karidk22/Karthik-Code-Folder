// Assignment 31
// Karthik Raghavun
// 25 November 2024
// Finds the count of 4, 9, and 7 and modifies the string to remove any 7s in the array. 

import java.util.Arrays;
import java.lang.Math;

public class App {
	public static void main( String args[] ) {
	// ARRAY NUMBER 1 ----------------------------------------
		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

		// Print the array for the user to view
		System.out.println(Arrays.toString(one));

		// Sum the values of positions listed (e.g. array[3] to array[6])
		System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));

		// Count the number of occurances of the number in the array
		System.out.println("# of 4s  =  " + getCount(one,4));
		System.out.println("# of 9s  =  " + getCount(one,9));
        System.out.println("# of 7s  =  " + getCount(one, 7));
        one = removeVal(one, 7);
        System.out.println("New array with all 7s removed = " + Arrays.toString(one));



	// ARRAY NUMBER TWO ----------------------------------------
		int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

		System.out.println("\n");
        System.out.println(Arrays.toString(two));
        System.out.println("Sum of spots 3-6 = " + getSum(two, 3, 6));
        System.out.println("Sum of spots 2-9 = " + getSum(two, 2, 9));

        System.out.println("# of 4s = " + getCount(two, 4));
        System.out.println("# of 9s = " + getCount(two, 9));
        System.out.println("# of 7s = " + getCount(two, 7));
        two = removeVal(two, 7);
        System.out.println("New array with all 7s removed = " + Arrays.toString(two));
		

	}

// METHODS/FUNCTIONS INSTEAD OF A SECOND FILE ----------------------------------------
	//instance variables and constructors could be used, but are not really needed


	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum = sum + numArray[i];
		}
		return sum;
	}


	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val) {
		int count = 0; 
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == val) {
				count++;
			}
		}
		return count;
	}

	//Remove val will replace the instance of particular numbers.
	//Returns an entire array
	public static int[] removeVal(int[] numArray, int val) {
		int size = numArray.length - getCount(numArray, val);
		int [] noVal = new int[size];

		int k = 0;

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != val) {
				noVal[k] = numArray[i];
				k++;
			}
		}

		return noVal;
	}
}