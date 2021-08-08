package Module1;

public class Demo2 {
	
	public void test1() {
		System.out.println("Running Non-Static Method");
	}

	public static void main(String[] args) {
	//ClassName ObjectName = New Classname()	
		Demo2 obj = new Demo2();
		
		obj.test1();
	//ObjectName.MethodName
	}
}
