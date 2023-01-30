import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner(",","[","]");
		sj.add("A").add("B").add("c");
		System.out.println(sj);
	
		StringJoiner sj2=new StringJoiner(":");
		sj2.add("P").add("Q");
		
		System.out.println(sj2);
		
		sj.merge(sj2);
		System.out.println(sj);
		
		
		
	}

}
