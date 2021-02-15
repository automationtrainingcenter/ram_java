package basics;
/*
String is a collection of characters
we can store String data using ""

Strings will store in a separate memory location known as 
String constant pool

Strings are immutable i.e. we can't change the value of String in 
that memory location

String can be stored as either String class object using 
new keyword or literal

    String var_name = new String("value");  using object

    String var_name = "value"; using literal

the default value is null.
Strings are index based. index number starts with 0
*/

public class StringsDemo {
	
	public static void main(String[] args) {
		// creating a String using String class object
		String s1 = new String("selenium");
		System.out.println(s1);
		
		// creating a String using String literal
		String s2 = "java";
		System.out.println("s2 -> "+ s2.hashCode()+" = "+s2);
		s2 = "python";
		System.out.println("s2 -> "+ s2.hashCode()+" = "+s2);		
		
		String s3 = "python";
		System.out.println("s3 -> "+ s3.hashCode()+" = "+s3);		
		
	}

}
