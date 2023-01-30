import java.util.ArrayList;

public class JoinTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Monday");
		list1.add("Tuesday");
	    list1.add("Wednesday");
	    list1.add("Thursday");
	    
	    System.out.println("The elements of the first array list is as follow: " + list1);
	    
	    ArrayList<String> list2=new ArrayList<String>();
	    	list2.add("Friday");
	       list2.add("Saturday");
	       list2.add("Sunday");
	       System.out.println("The elements of the second array list is as follow: " + list2);
	       

	       ArrayList<String> list3=new ArrayList<String> ();
	       
	       list3.addAll(list1);
	       list3.addAll(list2);
	       
	       System.out.println("The elements of the joining array list is as follow: " + list3);
	       
	}

}
