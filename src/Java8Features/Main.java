package Java8Features;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* AnonymousClass obj=new AnonymousClass() {
			
			public void show() {
				System.out.println("Hello, Anonymous class !!");
				
			}
			@Override
			public void printNumber(int num) {
			
				System.out.println("Print the number successfully!!" + num);	
			}
		
		obj.show();
		obj.printNumber(1234);
		
		*/
		
		AnonymousClass obj= (a,b)->{
			
			System.out.println("Addtion of two number: "+ (a+b));
		};
		obj.printNumber(43, 50);
		obj.print();
		AnonymousClass.show();
	}

}
