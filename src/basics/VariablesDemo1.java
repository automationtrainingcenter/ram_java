package basics;

public class VariablesDemo1 {

	// declare instance variable
	int iVar1;
	// Initialising instance variable
	int iVar2 = 10;

	// declare static variable
	static int sVar1;
	// initialising static variable
	static int sVar2 = 1000;

	// instance methods
	public void methodOne() {
		System.out.println("inside methodone");
		// access instance variables
		iVar1 = 20; // Assigning
		System.out.println("iVar1 is " + iVar1);
		System.out.println("iVar2 is " + iVar2);

		// access static variables
		sVar1 = 2000; // Assigning
		System.out.println("sVar1 is " + sVar1);
		System.out.println("sVar2 is " + sVar2);

	}

	public static void main(String[] args) {
		// access static variable
		System.out.println("before assingning values to svar1 and svar2");
		System.out.println("svar1 is " + sVar1);  // 0
		System.out.println("svar2 is " + sVar2); // 1000
		sVar1 = 20000; 
		sVar2 = 10000;
		System.out.println("assingned values to svar1 and svar2");
		System.out.println("svar1 is " + sVar1); // 20000
		System.out.println("svar2 is " + sVar2); // 10000
		
		
		// access instance variable
		// create object of the class
		VariablesDemo1 obj = new VariablesDemo1();
		System.out.println("VariablesDemo1 class object created");
		System.out.println("iVar1 is " + obj.iVar1);  // 0
		System.out.println("iVar2 is " + obj.iVar2);  // 10
		
		obj.iVar1 = 200;
		obj.iVar2 = 100;
		System.out.println("assingned values to ivar1 and ivar2");
		System.out.println("iVar1 is " + obj.iVar1); // 200
		System.out.println("iVar2 is " + obj.iVar2); // 100
		
		// calling methodOne
		obj.methodOne();

	}

	
}
