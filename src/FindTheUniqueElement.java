import java.util.HashSet;
import java.util.Set;

public class FindTheUniqueElement {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,3,56,34,70};
		int arr2[]= {23,45,70,3,10};
		
		printUnion(arr1, arr2);
	}
	
	static void printUnion(int arr1[], int arr2[])
	{
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		System.out.println("Union");
		System.out.println(set);
		

	}

}
