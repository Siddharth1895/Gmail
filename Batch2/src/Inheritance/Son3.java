package Inheritance;

public class Son3 extends Father1 {

	public void gold() {
		System.out.println("Gold");
	}
	
	public static void main(String[] args) {
		Son3 S3 = new Son3();
		
		S3.gold();
		S3.Money();
	}
}
