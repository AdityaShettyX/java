package opp;

class phone{
	public void charging() {
		System.out.println("device  is charging");
	}
}
class laptop extends phone {
	public void touchScreen() {
		System.out.println("laptop is touch screen");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		laptop a =new laptop();
		a.charging();
		a.touchScreen();

	}

}
