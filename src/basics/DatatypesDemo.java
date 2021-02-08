package basics;
/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 *
 * 2. reference
 * 		Arrays
 * 		Strings
 *
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 *
 * 	WCData_type obj_name = new WCData_type(value);
 *
 * 	Type Casting: converting one type of primitive data to another type of primitive data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 *
 * Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 *
 *
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 *
 * variable is nothing but name of memory location where we are storing data
 */

public class DatatypesDemo {

	public static void main(String[] args) {
		// creating boolean variable
		boolean b = true;
		System.out.println("b = " + b);
		System.out.println("boolean true is "+Boolean.TRUE);
		System.out.println("boolean false is "+Boolean.FALSE);
		

		// creating character variable
		char ch = 'R';
		System.out.println("ch = " + ch);
		System.out.println("character size in bytes is " + Character.BYTES);
		System.out.println("character size in bits is " + Character.SIZE);
		System.out.println("min value of character is " + Character.MIN_VALUE);
		System.out.println("max value of character is " + Character.MAX_VALUE);


		// creating byte variable
		byte by = 123;
		System.out.println("by = " + by);
		System.out.println("byte size in bytes is " + Byte.BYTES);
		System.out.println("byte size in bits is " + Byte.SIZE);
		System.out.println("min value of byte is " + Byte.MIN_VALUE);
		System.out.println("max value of byte is " + Byte.MAX_VALUE);

		// creating shrot variable
		short sh = 7865;
		System.out.println("sh = " + sh);
		System.out.println("short size in bytes is " + Short.BYTES);
		System.out.println("short size in bits is " + Short.SIZE);
		System.out.println("min value of short is " + Short.MIN_VALUE);
		System.out.println("max value of short is " + Short.MAX_VALUE);


		// creating int variable
		int i = 123456;
		System.out.println("i = " + i);
		System.out.println("int size in bytes is " + Integer.BYTES);
		System.out.println("int size in bits is " + Integer.SIZE);
		System.out.println("min value of int is " + Integer.MIN_VALUE);
		System.out.println("max value of int is " + Integer.MAX_VALUE);

		// creating long variable
		long l = 9876541234l;
		System.out.println("l = " + l);
		System.out.println("long size in bytes is " + Long.BYTES);
		System.out.println("long size in bits is " + Long.SIZE);
		System.out.println("min value of long is " + Long.MIN_VALUE);
		System.out.println("max value of long is " + Long.MAX_VALUE);


		// creating float variable
		float f = 9.8f;
		System.out.println("f = " + f);
		System.out.println("float size in bytes is " + Float.BYTES);
		System.out.println("float size in bits is " + Float.SIZE);
		System.out.println("min value of float is " + Float.MIN_VALUE);
		System.out.println("max value of float is " + Float.MAX_VALUE);


		// creating double variable
		double d = 9223372036854775807.0;
		System.out.println("d = " + d);
		System.out.println("double size in bytes is " + Double.BYTES);
		System.out.println("double size in bits is " + Double.SIZE);
		System.out.println("min value of double is " + Double.MIN_VALUE);
		System.out.println("max value of double is " + Double.MAX_VALUE);
		
	}

}
