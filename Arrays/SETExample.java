public class SETExample {

	public static void main(String[] args) {
		Set<Integer> myset=new HashSet<Integer>();
		myset.add(90);
		myset.add(8);
		myset.add(1);
		myset.add(92);
		myset.add(72);
		myset.add(2);
		myset.add(45);
		System.out.println("Element in Set : ");
		System.out.println(myset);
		
		System.out.println("Remove Element in SET  : " );
		
		myset.remove(72);
		
		System.out.println(myset);
		
		System.out.println("SEt is EMPTY or NOT : ");
		boolean mysetempty=myset.isEmpty();
		System.out.println(mysetempty);
		
		System.out.println("Iterator using in SET : ");
		Iterator it=myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
