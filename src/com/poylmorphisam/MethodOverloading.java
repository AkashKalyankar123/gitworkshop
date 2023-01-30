package com.poylmorphisam;
class Overloading
{
	double figure(double l, int b)
	{
		return l*b;
	}
	float figure(int s)
	{
		return s*s;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading over=new Overloading();
		System.out.println("Area of Rectangle"+over.figure(34.5, 23));
		System.out.println("Area of Square"+ over.figure(40));

	}

}
