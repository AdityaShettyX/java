package opp;

public class Abstraction extends Encap {

	public int addition(int a, int b) {
		return a + b;
	}

	public int subraction(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Abstraction i = new Abstraction();
		i.setAddress("mumbai");
		i.setId(01);
		i.setName("Aditya");

		System.out.println("name: " + i.getName());
		System.out.println("address: " + i.getAddress());
		System.out.println("id " + i.getId());

		System.out.println();

		Abstraction op = new Abstraction();
		System.out.println(op.addition(4, 6));
		System.out.println(op.subraction(10, 5));

	}

}
