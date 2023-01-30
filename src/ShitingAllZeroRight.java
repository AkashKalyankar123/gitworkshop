
public class ShitingAllZeroRight {

	
	static void shiftingAllZeroRight(int[] arr, int n)
	{
		int count=0;
		
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		
		while(count<n)
			arr[count++]=0;
	}
	
	public static void main(String[] args) {
	
		
		int arr[]= {2,0,3,7,4,0,5,0};
		
		int n=arr.length;
		
		shiftingAllZeroRight(arr,n);
		
		System.out.println("Array after pushing zeros to the back ");
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
