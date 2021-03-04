package methods_and_constructors;
/*
 * Methods are set of instructions written in a block to 
 * perform certain action
 * 
 * or 
 * 
 * Method is a collection of statements which are combined together 
 * to perform specific task
 * 
 * There are 4 types of methods in Java
 * 1. method without arguments and without return type
 * 2. method without arguments and with return type
 * 3. method with argument and without return type
 * 4. method with argument and with return type
 * 
 * every method contains 3 parts
 * method declaration or methods head
 * method body or method definition
 * method call
 * 
 * syntax to write a method declaration with method body
 * 		access_modifier static(optional) return_type method_name(arg1, arg2, ... argN){
 * 			statements inside the body
 * 			return statement;
 * 		}
 * 
 * here arguments are option, if method is not returning anything 
 * then the return type of the method is void
 * 
 *syntax to call a method
 *		return_type_data_type var_name = method_name(para1, para2, ... paraN);
 *
 *here parameters and return type variable are optional
 */

public class MethodsDemo {
	int i = 10;
	
	// method without input and without output
	public void methodOne() {
		System.out.println("this is method without input and without output");
		System.out.println("method one completed");
	}
	
	// method without input and with output
	public boolean methodTwo() {
		System.out.println("this is method without input and with boolean output");
		return true;
	}
	
	// method with input and without output
	public void methodThree(String name) {
		System.out.println("this is method with input and without output");
		System.out.println("input name is "+name);
		int noc = name.length();
		System.out.println("number of characters in name is "+noc);
	}
	
	// method with input and with output
	public String methodFour(String firstName, String lastName) {
		System.out.println("this is method with input and with output");
		System.out.println("input first name is "+firstName);
		System.out.println("input last name is "+lastName);
		System.out.println("this method returns a string output");
		char ln = lastName.toUpperCase().charAt(0);
//		String l = lastName.toUpperCase();
//		char ln = l.charAt(0);
		String name = firstName + " "+ln;
		
		return name;
	}

	public static void main(String[] args) {
//		boolean b = sc.nextBoolean(); = Scanner class method without input with boolean output
		System.out.println("inside main method");
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		System.out.println(obj.i);
		boolean r1 = obj.methodTwo();  // cntrl + 1 to assign the output to a local variable
		System.out.println(r1);
//		String s1 = "prakash";
//		obj.methodThree(s1);
		obj.methodThree("prakash");
		String r2 = obj.methodFour("surya", "prathipati");
		System.out.println(r2);
		
	}

}
