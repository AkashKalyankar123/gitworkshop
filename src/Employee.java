
public abstract class Employee {
	
	abstract void  display();
	
	
	void show()
	{
		System.out.println("Hello");
	}

}
class Xyz extends Employee
{

	@Override
	void display() {
		System.out.println("Display Method executed");
		
	}
	
}
