package Module3;

public class B extends A{

	int m = 300;
	
	public void test2() {
		
		int m = 400;
		
		double o = 3.5;
		
		System.out.println(m);
		System.out.println(this.m);
		System.out.println(super.m);
		
	}
	
	public static void main(String[] args) {
		
		B obj2 = new B();
		
		obj2.test2();
	}
}
