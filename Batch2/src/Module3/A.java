package Module3;

public class A {

	
	int m  = 100;
	
	public void test() {
		
		int m = 200;
		
		System.out.println(m);
		System.out.println(this.m);
	}
	
	
	public static void main(String[] args) {
		
		A obj = new A();
		
		obj.test();
		
	}
	
}
