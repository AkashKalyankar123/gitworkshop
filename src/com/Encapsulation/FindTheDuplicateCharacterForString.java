package com.Encapsulation;

public class FindTheDuplicateCharacterForString {

	public static void main(String[] args) {
		
		String str="beautiful beach";
		char[] charArr=str.toCharArray();
		
		System.out.println("The String is :"+ str);
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(charArr[i]==charArr[j])
				{
					System.out.print(charArr[j]+" ");
				}
			}
		}
		
	}

}
