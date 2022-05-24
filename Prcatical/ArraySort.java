package Basics;
import java.util.*;
public class ArraySort {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        int[] arr = { 4,6,2,6,8,12,34,66,88,23,5,77,6,4,22 }; // SD Array
 
        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(arr);
 
        // Printing the array after sorting
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}