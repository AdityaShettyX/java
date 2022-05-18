package opp;

class phone {
	public void charging() {
		System.out.println("device  is charging");
	}
}

class laptop extends phone {
	public void touchScreen() {
		System.out.println("laptop is touch screen");
	}
}

class computer extends laptop {
	public void monitor() {
		System.out.println("it has a monitor");
	}
}

public class MutipleInheritace {

	public static void main(String[] args) {
		computer c = new computer();
		c.monitor();
		c.touchScreen();

	}

}
