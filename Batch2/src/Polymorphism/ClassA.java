package Polymorphism;

public class ClassA {
public static void main(String[] args) {
	
String str = "Visiest";

String str2 = "Visiest";

String str3 = "VISIEST";

String str4 = "a";


System.out.println(str.length());
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
System.out.println(str.charAt(3));
System.out.println(str.indexOf("i"));
System.out.println(str.lastIndexOf("i"));
System.out.println(str.equals(str3));
System.out.println(str.equalsIgnoreCase(str3));
System.out.println(str.contains("sie"));
System.out.println(str4.isEmpty());
String str5 = str.concat(str2);
System.out.println(str5);
String str6 = str.concat("avf");
System.out.println(str6);
System.out.println(str.startsWith("Vi"));
System.out.println(str.endsWith("st"));

}
}

