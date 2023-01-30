import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateOccurrrenceOFEachWord {

	static void findDuplicateWord(String str)
	{
		HashMap<String, Integer> hm=new HashMap<>();
		String[] s= str.split(" ");
		
		for(String str1:s)
			if(hm.get(str1)!=null)
				
				hm.put(str1, hm.get(str1)+1);
			else
				hm.put(str1, 1);
		
		System.out.println(hm);
		
		/*Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			String temp = itr.next();
			if(hm.get(temp)>1)
				System.out.println("The word " +temp+ " apper "+ hm.get(temp)+ " no.of times.");
		}*/
	}
	public static void main(String[] args) {
		
		findDuplicateWord("I am am learing java java");
		
	}

}
