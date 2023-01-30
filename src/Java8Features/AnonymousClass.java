package Java8Features;

@FunctionalInterface
public interface AnonymousClass {

	//public void show();
	
	
	
	public void printNumber(int a, int b); //Declaring only one abstract method is konwn as functional interface.
	
	default void print() {
		System.out.println("I am default method");
	}
	
	static void show()
	{
		System.out.println(" I am static method..!");
	}
	
}
