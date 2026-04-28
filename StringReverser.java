public class StringReverser{

    public static String reverse(String s){
        if(s==null){
            return null;

        }

        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            sb.append(charAt(i));
        }
        return sb.toString();
    }
    public static void main(String args[]){

        String str="Hello";

        System.out.println(reverse(str));

    }
}