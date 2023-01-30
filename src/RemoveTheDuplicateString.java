
public class RemoveTheDuplicateString {

	public static void main(String[] args) {
		
		String str="Programming";
		
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(s->sb.append((char)s));
		System.out.println(sb);
	}

}
