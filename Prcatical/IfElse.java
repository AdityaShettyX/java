package loops;

public class IfElse {

	public static void main(String[] args) {
		int n = 2;
		float res =0;
		for(float i=1;i<=n;i++) {
			if(i%2==0) {
			res -=1/i;
			}else {
				res+=1/i;
			}
		}
		System.out.println(res);
		
		
	}

}
