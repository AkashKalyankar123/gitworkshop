
public class SwapTwoStringWithoutThirdVarible {

	public static void main(String[] args) {
		
		
		String a="Hello";
		String b="world";
		
		System.out.println("String before swap: a=" + a + " and b=" +b);
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println("String after swap: a="+ a + " and b="+ b);
		

	}

}
