import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> number=Arrays.asList(10,12,65,36,17,30);
		
		List<String>str=new ArrayList<String>();
		
		str.add("Akash");
		str.add("Rohit");
		str.add("Komal");
		str.add("Anil");
		str.add("Ajikay");
		
		str.stream().map(s-> s+" ").filter(s->s.startsWith("A")).forEach(System.out::println);
	}

}
