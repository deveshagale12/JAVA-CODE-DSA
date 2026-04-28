public class Fibonacci{
    public static int fibo(int n){
        if(n<=1) return n;

        return fibo(n-1)+fibo(n-2);
    }
    public static int fibo2(int n){
        if(n<=1) return n;

        int prev=0;
        int current=1;
        for(int i=0;i<=n;i++){
            int next=prev+current;
            prev=current;
            current=next;
    }
    return current;
    }
    public static void main(String[] args){
        int n=18;
        System.out.println(fibo(n))
    }
}