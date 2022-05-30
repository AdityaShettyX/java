package labsession;

import java.util.*;

// java program for Taking an Array input and adding the odd and even element
public class AddingEvenOddArray {

	public static void main(String[] args) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size interger set ");

		int n = sc.nextInt();//taking input from user

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();//taking input from user
		}
		
		System.out.println("The set of Integer is " + Arrays.toString(arr));// printing the array
		
		// creating variable
		int resultForEven = 0;
		int resultForodd = 0;
		for (int j = 0; j < arr.length; j++) {
			// adding elements of array depending on if they are odd or even
			if (arr[j] % 2 == 0) {
				resultForEven = resultForEven + arr[j];

			} else if (arr[j] % 2 != 0) {
				resultForodd = resultForodd + arr[j];
			}
		}
		// printing output
		System.out.println("Addition of even number is " + resultForEven);
		System.out.println("Addition of odd number is " + resultForodd);

	}

}
