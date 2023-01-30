import java.util.Scanner;

public class EvanAndOddNumber {
	
	public static void checkEvenOrOdd(int arr[], int n)
	{ 
		int even=0;
		int odd=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
				System.out.println(arr[i++]);
			}else
			{
				odd++;
				System.out.println(arr[i]);
			}
				
		}
		
	}
	
	
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int n=arr.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array element: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		checkEvenOrOdd(arr,n);
		
		
		
	}
}
