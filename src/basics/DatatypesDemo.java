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
		
		
		// type casting
		// up casting: lower memory type to higher memory type
		// higher_data_type_variable = lower_data_type_variable
		byte num1 = 127;
		short b2s = num1;
		System.out.println("b2s = "+b2s);
		
		int num2 = 78654;
		long i2l;
		i2l = num2;
		System.out.println("i2l = "+i2l);
		
		
		// down casting: higher memory type to lower memory type
		// lower_data_type_variable = (lower_data_type) higher_data_type_variable
		short num3 = 130;
		byte s2b = (byte) num3;
		System.out.println("s2b = "+s2b);
		
		long num4  = 21345678910l;
		int l2i = (int) num4;
		System.out.println("l2i = "+l2i);
		
		
		// int to float
		int i2 = 1234;
		float i2f = i2;
		System.out.println(i2f);
		
		// float to int
		float f2 = 2.34f;
		int f2i = (int) f2;
		System.out.println("f2i = "+f2i);
		
		
		// boxing: primitive to wrapper
		int ip = 12345;
		Integer ipw = ip;
		Integer ipw1 = Integer.valueOf(ip);
		
		float fp = 12.33f;
		Float fpw = fp;
		Float fpw1 = Float.valueOf(fp);
		
		// unboxing: wrapper to primitive
		Integer iw = new Integer(8976666);
		int iwp = iw;
		int iwp1 = iw.intValue();
		System.out.println(iwp1);
		
		Double dw = new Double(9.8);
		double dwp = dw;
		double dwp1 = dw.doubleValue();
		
		// type conversion
		// primitive to reference (String)
		int i1 = 6785;
		String i2s = Integer.toString(i1);
		System.out.println(i2s+10);
		
		float f1 = 9.78f;
		String f2s = Float.toString(f1);
		System.out.println(f2s+10);
		
		// reference to primitive
		String s1 = "123456";
		int s2i = Integer.parseInt(s1);
		System.out.println(s2i+10);
		
		String s2 = "789.12";
		double s2d = Double.parseDouble(s2);
		System.out.println(s2d+10);
		
		
		// if string contains an integer value then we can convert that to either 
		// int or long or float or double
		// convert s1 to float
		float s12f = Float.parseFloat(s1);
		System.out.println(s12f);
		
		// if string contains a float point value then we can convert that to either
		// float or double
//		int s22i = Integer.parseInt(s2); it will give NumberFormatException
		
		
		
		
		
		
		
	}

}
