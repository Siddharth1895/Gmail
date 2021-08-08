package CollectionPractice;

import java.awt.List;
import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {
	
		//Collection - List

		//ArrayList
		ArrayList<String> Students = new ArrayList<String>();
		
		Students.add("Vikas");
		Students.add("Jaydeep");
		Students.add("Avadhut");
		Students.add("Rohan");
		Students.add("Omkar");

		
		System.out.println(Students);
		
		Students.remove(4);
		
		System.out.println(Students);
		
		Students.set(0, "VIKAS");
		
		System.out.println(Students);
		
		System.out.println(Students.get(3));
		
		System.out.println(Students.size());
		
		for(String str:Students) {
			
		System.out.println(str);
		}
		
		
		
	}

}
