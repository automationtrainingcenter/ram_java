package basics;

public class StaticVsInstance {

	int i = 0;
	static int j = 0;

	public void increment() {
		i = i + 1;
		j = j + 1;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
	
	public static void main(String[] args) {
		StaticVsInstance obj1 = new StaticVsInstance();
		obj1.increment();
		
		StaticVsInstance obj2 = new StaticVsInstance();
		obj2.increment();
		
		StaticVsInstance obj3 = new StaticVsInstance();
		obj3.increment();
		
	}

}
