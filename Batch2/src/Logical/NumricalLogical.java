package Logical;

public class NumricalLogical {
	
	public static int fib(int n) {
		if(n<=1){
			return n;
		}
		return fib(n-2)+fib(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("-----------------------Prime Number-------------------------------------");
		int n = 11;
		int count = 0;
		
		for (int i =2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;	
			}
		}
		
		if(count == 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
			}
	
		System.out.println("----------------------Revrse Number------------------------------------");
		
		int n1 = 125;
		int s1 = 0;
		int t1;
		while(n1>0) {
			t1 = n1%10;
			s1 =(s1*10)+t1;
			n1 = n1/10;
		}
		System.out.println(s1);
		
		System.out.println("-----------------------Armstrong Number-------------------------------------");
		
		int n2 = 153;
		int s2 = 0;
		int t2;
		while(n2>0) {
			t2 = n2%10;
			s2 =(t2*t2*t2)+s2;
			n2 = n2/10;
		}
		System.out.println(s2);
		
		System.out.println("-------------------Fibonacci series----------------");
		int n3 = 7;
		System.out.println(fib(n3));
		
	}

}
