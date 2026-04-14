package string;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HELLO";
		String s2="Hello";
		
		System.out.println("The Lenght of String : "+s1+ " is "+s1.length());
		
		if(s1.equals(s2)) {
			System.out.println("String s1 : "+s1+"  &  String s2 : "+s2+ " is equal");
		}
		else {
			System.out.println("String s1 : "+s1+"  &  String s2 : "+s2+ " is not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String s1 : "+s1+"  &  String s2 : "+s2+ " is equal(equalsIgnoreCase)");
		}
		else {
			System.out.println("String s1 : "+s1+"  &  String s2 : "+s2+ " is not equal(equalsIgnoreCase)");
		}
		System.out.println("In String s1 : "+s1+ " at position 2 is : "+s1.charAt(2));
		
		System.out.println("String s1 : "+s1+"  &  String s2 : "+s2+ " Compare to"+s1.compareTo(s2));
	}

}
