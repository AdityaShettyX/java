package labsession;

import java.util.*;

//java program to remove specific  element from the array
public class RemovingElemet {

	public static void main(String[] args) {
		
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array of size 5");
		int my_array[] = new int[5];
]		for (int i = 0; i < my_array.length; i++) {
			my_array[i] = sc.nextInt();//user input
		}

		System.out.println("Original Array : " + Arrays.toString(my_array));

		// Remove the second element  of the array
		int removeIndex = 1;

		for (int i = removeIndex; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}
		// We cannot alter the size of an array , after the removal, the last and second
		// last element in the array will exist twice
		System.out.println("After removing the second element: " + Arrays.toString(my_array));
	}

}
