
public class Prime3 {
public static void main(String[] args) {
	int n=17;
	boolean isPrime=true;
	
	if(n<=1) {
		isPrime=false;
	}else {
		for(int i=2;i*i<=n;i++) {
			System.out.println(i);
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
	}
	if(isPrime==true) {
		System.out.println("Prime");
	}else {
		System.out.println("not Prime");
	}

}
}
