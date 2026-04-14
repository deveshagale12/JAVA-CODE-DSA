
package string;

import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {

		char[] charString = {'s','g','u','w','d'};
		
		Scanner sc= new Scanner(System.in);
		
		String str=new String(charString);
		
		System.out.println("CharacterString : "+charString);
		System.out.println("STring :" +str);
		
		System.out.println("Enter the value in Strring  : ");
		str=sc.next();
		System.out.println("Enter value of STring str : "+str);
		System.out.println("The Value of str is :"+str);

		str="Java String";
		System.out.println("The Value of str is :"+str);
		
		str="String"+" "+"concatenate";
		System.out.println("The Value of str is :"+str);

		sc.close();
	}
	

}
