
public class Fibonacci1 {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<=n;i++) {
			int next;
			next=n1+n2;
			n1=n2;
			n2=next;
			System.out.println(next);
		}
	}
}
