import java.util.*;
public class OuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size interger set ");
		int n= sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The set of Integer is "+Arrays.toString(arr));
		int resultForEven=0;
		int resultForodd=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]% 2==0) {
				 resultForEven= resultForEven+arr[j];
				
			}else if(arr[j]% 2!=0) {
				resultForodd=resultForodd+arr[j];
				}
		}
		System.out.println("Addition of even number is "+resultForEven);
		System.out.println("Addition of odd number is "+resultForodd);



	}

}
