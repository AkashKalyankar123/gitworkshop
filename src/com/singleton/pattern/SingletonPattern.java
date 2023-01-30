package com.singleton.pattern;

public class SingletonPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car c1=Car.getInstance();
//		Car c2=Car.getInstance();
//		System.out.println(c1);
//		System.out.println(c2);
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				Car c1=Car.getInstance();
				System.out.println(c1);
				super.run();
			}
		};
		
		Thread t2=new Thread(){
			@Override
			public void run()
			{
				Car c2=Car.getInstance();
				System.out.println(c2);
				super.run();
			}
		};
		t1.start();
		t2.start();
	}

}
