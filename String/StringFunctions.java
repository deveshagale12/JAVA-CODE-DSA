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
		
		String str1="AABBCABBAA";
		
		String str2="JAVA String Functions";
		
		//check wheather the string with or ends with substring or not 
		System.out.println("STring str1 : "+str1 +" is startwith(AAB) : "+str1.startsWith("AAB"));
		
		System.out.println("STring str1 : "+str1 + " is endsWith(ACB) : "+str1.endsWith("ACB"));
		
		//find the location of first and last occurance of substring
		
		System.out.println("String str1 : "+ str1+ "first index of (BB) in : "+str1.indexOf("BB"));
		System.out.println("String str1 : "+ str1+ "Last index of (BB) in : "+str1.lastIndexOf("BB"));
		
		//replace a substring with new substring 
		
		System.out.println("Rplacement od substring(AAB) into (XYZ) "+str1+ " is "+str1.replace("AAB", "XYZ"));
		
		//get substring from a given string 
		System.out.println(" Get substring from String str2 "+ str2+" from 5 to 15 "+str2.substring(5,15));
		
		//split a strting by using (-) delimeter
		
		str1="This-is-a-a-tets-string";
		String[] splitArr=str1.split("-");
		
		System.out.println("Splited parts are : ");
		
		for(String sp:splitArr) {
			System.out.println(sp);
		}

		//trim the blankl space from starting and ending of the string
		
		str2="          Lot's of Space         ";
		
		System.out.println("Before triming : ("+str2+")");
		
		System.out.println("After triming : ("+str2.trim()+")");


	}

}
