
import java.util.HashMap;

public class Duplicate {

	public static void main(String[] args) {
		 int arr[]= {10,20,10,20,384,28,20};
		 HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		 int count=0;
		 for(int n:arr) {
			if(map.containsKey(n)) {
				System.out.println("Duplicate"+n);
				count ++;
			}
			 map.put(n, 1);

		 }
		 map.forEach((key,value)->{
			 System.out.println(key+" -->"+value);
		 });
		 System.out.println("Duplicate number count : "+count);
	}

}
