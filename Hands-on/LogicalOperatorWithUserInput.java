package Basics;
import java.util.*;

public class LogicalOperatorWithUserInput{
	public static void main(String[]args) {
		 //intialising variables
		Scanner sc =new Scanner(System.in);
		
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=sc.nextInt();
				  

	        //a, b, c displaying
	        System.out.println("Value of a: "+ a);
	        System.out.println("Value of b: "+ b);
	        System.out.println("Value of b: "+ c);
	        
	        //and operator
	        if((a<b) && (b==c)) {

	            int x=a+b+c;
	            System.out.println("Sum is: " + x);
	        }
	 
	        else 
	            System.out.println("False Condition");
		}
	        
	        //or operator
//	        if((a<b) || (b==c)) {
//
//	            int d=a+b+c;
//	            System.out.println("Sum is: " + d);
//	        }
//	 
//	        else 
//	            System.out.println("False Condition");
//		}

	        

//	        System.out.println("!(a < b) = " + !(a < b));
//	        System.out.println("!(a > b) = " + !(a > b));
	        
		}



