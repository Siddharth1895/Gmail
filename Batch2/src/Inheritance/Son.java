package Inheritance;

public class Son extends Father{

	public void bike() {
		System.out.println("bike");
	}
	
	public static void main(String[] args) {
		Son S = new Son();
		S.House();
		S.car();
		S.Land();
		S.bike();
		S.Farm();
		S.Money();
		
	}
}
