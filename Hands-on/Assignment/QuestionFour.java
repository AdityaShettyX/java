import java.util.*;
public class QuestionFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the pattern");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			int spaces=n-i-1;
			for(int s=0;s<spaces;s++) {
				System.out.print(" ");
			}
			int Num=i+1;
			for(int j=0;j<Num;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
