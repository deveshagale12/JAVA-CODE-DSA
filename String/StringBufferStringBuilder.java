public class StringBufferStringBuilder {

	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer();
		//capacity of StringBuffer
		System.out.println("StringBuffer capacity : "+sBuffer.capacity());
		
		//set capacity to string buffer 
		sBuffer=new StringBuffer(60);
		System.out.println("StringBuffer capacity : "+sBuffer.capacity());
		
		sBuffer=new StringBuffer("My StringBuffer");
		System.out.println("StringBuffer capacity : "+sBuffer.capacity());
		
		System.out.println("StringBuffer : "+sBuffer);


		//StringBuilder are used same as a StringBuffer
		StringBuilder myBuilder=new StringBuilder("My StringBuilder");
		
		System.out.println("My StringBuilder "+myBuilder);
		sBuffer.append(" . Appended with Stringbuffer.");

		myBuilder.append(" . Appended with Stringbuilder.");
		
		System.out.println("String in StringBuffer : "+sBuffer);
		System.out.println("String in StringBuilder : "+myBuilder);
		
		sBuffer=new StringBuffer("AABCABBC");
		myBuilder = new StringBuilder("abaabcabac");
		
		System.out.println("String in StringBuffer : "+sBuffer);
		System.out.println("String in StringBuilder : "+myBuilder);
		
		sBuffer.insert(5,"pqrst");
		myBuilder.insert(3,"XYZ");
		
		System.out.println("String in StringBuffer used insert : "+sBuffer);
		System.out.println("String in StringBuilder used insert : "+myBuilder);
		
		System.out.println("reverse of String in StringBuffer : "+sBuffer.reverse());
		System.out.println("reverse String in StringBuilder : "+myBuilder.reverse());
	}
}
