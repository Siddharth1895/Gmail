package Inheritance;

public class Son1 extends Father1{

	public void bike() {
		System.out.println("bike");
	}
	
	public static void main(String[] args) {
		Son1 S1 = new Son1();
		S1.bike();
		S1.House();
		S1.Land();
		S1.Money();
	}
}
