import java.util.HashSet;
import java.util.Set;

public class FindTheCommanElementInArray {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,3,56,34,70};
		int arr2[]= {23,45,70,3,10};
		
		printIntersection(arr1, arr2);

	}
	
	static void printIntersection(int arr1[], int arr2[])
	{
		Set<Integer>set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(arr2[i]))
			{
				System.out.print(arr2[i]+ " ");
			}
				
		}
	}

}
