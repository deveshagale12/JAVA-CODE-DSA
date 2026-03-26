import java.util.Scanner;

public class MOVEZEROSATEND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter Element in an Arrays : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		
		}
		//add remaining zeros in an arrays
		while(count < n) {
		    arr[count++] = 0; // This fills all remaining spots
		}
		System.out.println("Display Array");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
