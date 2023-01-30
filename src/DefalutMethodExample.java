interface  TestInterface1
{
	default void display()
	{
		System.out.println("This is programming language");
	}
	public default void show()
	{
		System.out.println("Default interface1");
	}
}
interface TestInterface2
{
	default void display()
	{
		System.out.println("This is programming language2");
	}
	public default void show()
	{
		System.out.println("Default interface2");
	}
}
class TestClass implements TestInterface1,TestInterface2
{

	@Override
	public void show() {
		
		TestInterface1.super.show();
		TestInterface2.super.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		TestInterface1.super.display();
		TestInterface2.super.display();
	}
	
}
public class DefalutMethodExample {

	public static void main(String[] args) {
		
		TestClass d=new TestClass();
		d.show();
		d.display();

	}

}
