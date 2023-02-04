package com.synchronication_example;

public class BookTheaterSeat {
	int total_seat=10;
	
	 void bookSeat(int seats)
	{
		System.out.println("Hi.."+Thread.currentThread().getName());
		System.out.println("Hi.."+Thread.currentThread().getName());
		System.out.println("Hi.."+Thread.currentThread().getName());
		System.out.println("Hi.."+Thread.currentThread().getName());
		System.out.println("Hi.."+Thread.currentThread().getName());
		
		synchronized (this) {
			
			if(total_seat>=seats)
			{
				System.out.println(seats + " Seats booked successfully...!!");
				total_seat=total_seat-seats;
				System.out.println("Seats left: "+ total_seat);
			}
			else
			{
				System.out.println("Sorry Seats Can not booked..!!");
				System.out.println("Seats left: "+ total_seat);
			}
		}
		
		System.out.println("Hello.."+Thread.currentThread().getName());
		System.out.println("Hello.."+Thread.currentThread().getName());
		System.out.println("Hello.."+Thread.currentThread().getName());
		System.out.println("Hello.."+Thread.currentThread().getName());
		System.out.println("Hello.."+Thread.currentThread().getName());
	}
}

