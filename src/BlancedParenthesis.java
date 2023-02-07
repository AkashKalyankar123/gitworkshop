import java.util.Stack;

public class BlancedParenthesis {

	public static boolean isBalenced(String s)
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				
				stack.push(c);
				
			}else if(c == ')' || c == '}' || c == ']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				char top=stack.pop();
				
				if(!((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')))
				{
					return false;
				}
			}	
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		String s="(([()]))";
		
		if(isBalenced(s))
		{
			System.out.println(s +" is blanced Parenthesis expression.");
		}
		else
		{
			System.out.println(s +" is not blanced parenthesis expresiton.");
		}
	}

}
