
public class CountSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Akash@123";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && 
					!Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("There are no special character in String");
		}
		else
		{
			System.out.println("Spacial character is Found: "+count);
		}
	}

}
