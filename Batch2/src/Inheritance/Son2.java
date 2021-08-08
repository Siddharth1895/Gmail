package Inheritance;

public class Son2 extends Father1 {

	public void flat() {
		System.out.println("Flat");
	}
	
	public static void main(String[] args) {
		Son2 S2 = new Son2();
		
		S2.flat();
		S2.House();
		S2.Land();
		
	}
}
