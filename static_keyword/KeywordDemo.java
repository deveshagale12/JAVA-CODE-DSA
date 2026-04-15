public class KeywordDemo{
	public static void main(String[] args) {
		KeywordStatic st1=new KeywordStatic();
		KeywordStatic st2=new KeywordStatic();
		
	st1.increase();
	st1.increase();

	st1.display();
	
	st2.increase();
	st2.increase();

	st2.increase();

	st2.display();
	
	KeywordStatic.setStaticvar(50);
	
	System.out.println("static variable without object : "+KeywordStatic.staticVar);
	
	}
}