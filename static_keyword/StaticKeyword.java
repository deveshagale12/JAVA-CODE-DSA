public class KeywordStatic {
	static int staticVar;
	int var;
	
	public KeywordStatic(){
		
	}
	
	public static void setStaticvar(int x) {
		staticVar = x;
		
	}
	
	public void increase() {
		staticVar++;
		var++;
	}
	
	public void display() {
		
		System.out.println("The Value of static value: "+staticVar);
		System.out.println("The Value of non-static value: "+var);
		System.out.println();

	}
}


