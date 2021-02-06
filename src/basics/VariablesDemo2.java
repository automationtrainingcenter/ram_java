package basics;

public class VariablesDemo2 {
	
	public static void main(String[] args) {
		// access VariablesDemo1 class instance and static variables
		// instance variables
		VariablesDemo1 obj = new VariablesDemo1();
		System.out.println(obj.iVar1);
		System.out.println(obj.iVar2);
		
		// static variables
		System.out.println(VariablesDemo1.sVar1);
		System.out.println(VariablesDemo1.sVar2);

		// calling instance method (methodOne) of VariablesDemo1
		obj.methodOne();
 	}

}
