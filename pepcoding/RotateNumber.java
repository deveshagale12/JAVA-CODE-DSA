import java.util.Scanner;


public class RotateNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to be count : ");
		int n=sc.nextInt();
		System.out.println("how much number to be rotate : ");
		int k= sc.nextInt();
		
		int nod=0;
		int temp=n;
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		System.out.println("Number of digit is : "+nod);
		
		k=k%nod; /// if k=2 and nod=5 ==
		if(k<0) {
			k=k+nod;
		}
		
		int div=1, mul=1;
		
		for(int i=1;i<=nod;i++) {
			if(i<=k) {
				div=div*10;
			}else {
				mul=mul*10;
			}
		}
		int q=n/div;
		int r=n%div;
		
		int rotated=r*mul+q;
		System.out.println(rotated);}
}
