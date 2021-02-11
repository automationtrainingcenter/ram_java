package basics;

import java.util.Scanner;

/*
to read data from the console we have to use
Scanner class. This class contains several methods to read the data based
on the type of data we are reading

All these methods are instance methods, so we have to create an object of the
Scanner class to call these methods


Syntax to create a Scanner class object
    Scanner obj_name = new Scanner(input_source);
eg:
    Scanner sc = new Scanner(System.in);

Methods:
boolean  -- nextBoolean()
byte -- nextByte()
short -- nextShort()
int --- nextInt()
long -- nextLong()
float -- nextFloat()
double -- nextDouble()

Scanner class does not contains any method to read a character data
to read a character we have to read that character as string and convert that string
to character

String -- next() -- to read String single word
String -- nextLine() -- to read String with multiple words
 */

public class ReadingData {

	public static void main(String[] args) {
		// to read the data from the console we have to use Scanner class
		// first create an object of Scanner class to read the data from the console
		Scanner sc = new Scanner(System.in);

		// read int : nextInt()
		System.out.println("enter a number");
		int i = sc.nextInt();
		System.out.println("int i = " + i);

		// read float : nextFloat()
		System.out.println("enter a float number");
		float f = sc.nextFloat();
		System.out.println("float f = " + f);

		// read boolean : nextBoolean()
		System.out.println("enter a boolean data");
		boolean b = sc.nextBoolean();
		System.out.println("boolean b = " + b);
		
		// read byte : nextByte()
		System.out.println("enter a byte number");
		byte by = sc.nextByte();
		System.out.println("byte by = "+by);
		
		// read short : nextShort()
		System.out.println("enter a short number");
		short sh = sc.nextShort();
		System.out.println("short sh = "+sh);
		
		// read long : nextLong()
		System.out.println("enter a long number");
		long l = sc.nextLong();
		System.out.println("long l = "+l);
		
		// read double : nextDouble()
		System.out.println("enter a dobule number");
		double d = sc.nextDouble();
		System.out.println("double d = "+d);
		
		// read string : next() {single word}
		System.out.println("enter a string");
		String str = sc.next();
		System.out.println("str = "+str);
		
		
		
	}

}
