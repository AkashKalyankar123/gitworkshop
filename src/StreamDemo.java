import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(56);
		list.add(3);
		
		List<Integer> list2 = list.stream().filter(no-> no>=15).collect(Collectors.toList());
		//list.stream().forEach(x-> System.out.println(x));
		System.out.println(list2);
		
		list.stream().filter(no->no%2==0).forEach(System.out::println);
		
		/*for(Integer i:list2)
		{
			System.out.println(i);
		}*/
	}

}
