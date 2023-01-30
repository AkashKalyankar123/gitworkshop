import java.util.Arrays;

public class FindSecondHighestNumberInArray {

	public static void printSecondHighestNumber(int arr[])
	{
		int size=arr.length;
		
		if(size<2) {
			System.out.println("Invalid Input");
			return;
		}
		Arrays.sort(arr);
		//System.out.println(arr[size-2]);
		for(int i=size-2;i>=0;i--)
		{
			if(arr[i]!=arr[size-1])
			{
				System.out.println("The second largest element is:"+ arr[i]);
				return;
			}
		}
		System.out.println("there is no second largest number");
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,34,53,53,123};
		printSecondHighestNumber(arr);

	}

}
