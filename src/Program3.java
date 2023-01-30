import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		String temp;
		System.out.println("Enter the number of names you want to enter: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String[] names= new String[n];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the all names: ");
		
		for(int i=0;i<n;i++)
		{
			names[i]=sc1.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Names is sorted order: ");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(names[i]+",");
		}
		System.out.print(names[n-1]);
	}

}
