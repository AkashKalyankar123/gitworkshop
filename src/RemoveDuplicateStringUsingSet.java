import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateStringUsingSet {

	public static void main(String[] args) {
		
		String str="manmohan";
		StringBuffer sb=new StringBuffer();
		
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		
			for(Character ch:set)
			{
				sb.append(ch);
			}
			
			System.out.println(sb);
	}

}
