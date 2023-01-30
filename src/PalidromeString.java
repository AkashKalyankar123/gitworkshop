
public class PalidromeString {

	public static void main(String[] args) {
		String str="i love malalam";

		String[] s=str.split(" ");
		
		if(isPalidrome(str))
		{
			System.out.println(s);
		}
	}
	
	public static boolean isPalidrome(String str)
	{
		int i1=0;
		int i2=str.length()-1;
		boolean ans = false;
		
		while(i1<12)
		{
			if(str.charAt(i1)!= str.charAt(i2))
			{
				ans=true;
			}
		}
		i1++;
		i2--;
		return ans;
	}

}
