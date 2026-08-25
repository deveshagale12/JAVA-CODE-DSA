
public class Prime1 {

	public static void main(String[] args) {
		int n=17;
		boolean isPrime=true;
		
		if(n<=1) {
			isPrime=false;
		}else{
			for(int i=2;i<n;i++) {
				if(n%i==0) {
				isPrime=false;
				break;
				}
			}
		}
		if(isPrime==true) {
			System.out.println("Prime Number");
		}else {
			System.out.println("NOt Prime Number");
		}
	}
}
