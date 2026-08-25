import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		int digit=0;
		while(n!=0) {
			n=n/10;
			System.out.println(n);
			digit++;
		}
		
		System.out.println("Count of Digit is : "+digit);

	}
}
