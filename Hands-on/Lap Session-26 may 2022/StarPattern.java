package labsession;

import java.util.*;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the pattern");
		// input for size of pattern
		int n = sc.nextInt();
		// loop for printing row
		for (int i = 0; i < n; i++) {
			int spaces = n - i - 1;
			// lop for printing space
			for (int s = 0; s < spaces; s++) {
				System.out.print(" ");
			}
			int Num = i + 1;
			// loop for printing star
			for (int j = 0; j < Num; j++) {
				System.out.print("* ");
			}
			// printing new line
			System.out.println();
		}

	}

}
