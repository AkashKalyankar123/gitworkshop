
public class RemoveSpacialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Akash@#123";
		int count=0;
		String spacialCharacterRemoved="";
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && 
					!Character.isWhitespace(str.charAt(i)))
			{
				count++;
			}
			else
			{
				spacialCharacterRemoved=spacialCharacterRemoved + str.charAt(i);
			}
		}
		System.out.println(spacialCharacterRemoved);
		
	}

}
