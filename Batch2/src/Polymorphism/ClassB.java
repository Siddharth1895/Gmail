package Polymorphism;

public class ClassB extends ClassA {
	
	
	public void test() {
		System.out.println("Running B class Method");
	}

	public static void main(String[] args) {
	
		ClassB b = new ClassB();
		
		b.test();
	}


}
