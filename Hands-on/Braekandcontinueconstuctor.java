package Basics;
import java.util.*;

class phone {
	int price;
	String Brand, model, camera;

	phone() {
		System.out.println("inside constructor");
	}

	phone(String Newcamera, int Newprice) {
		camera = Newcamera;
		price = Newprice;
	}

}

public class Braekandcontinueconstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		phone a = new phone("sony a7s3", 50000);
		System.out.println("the model of the camera is "+a.camera);
		System.out.println("the price of the camera is "+a.price);
		
		System.out.println();
		
		System.out.println("enter the number :");
		
		System.out.println();
		int n= sc.nextInt();
		System.out.println("for break");

		for(int i =1;i<=n;i++) {
			if(i==5) {
				break;
			}
		System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println("for continue ");
		for(int j=1;j<n;j++) {
			if(j==5) {
				continue;
			}
			System.out.println(j);
		}

	}

}
