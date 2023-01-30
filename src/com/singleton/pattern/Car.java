package com.singleton.pattern;

public class Car {
	
	private static Car obj;
	
	public Car()
	{
	}
	public static Car getInstance()
	{
		
//		if(obj==null)
//		{
//			return obj=new Car();
//		}
//		return obj;
	
	
	
	
		if(obj==null)
		{
			synchronized (Car.class) {
				if(obj==null)
				{
					return obj=new Car();
				}
				return obj;
				
			}
		}
		return obj;

	}
	
	
}
