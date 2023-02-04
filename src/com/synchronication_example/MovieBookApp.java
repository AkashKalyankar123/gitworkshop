package com.synchronication_example;

public class MovieBookApp extends Thread
{
	static BookTheaterSeat bookTheaterSeat;
	
	int seats;
	public void run()
	{
		bookTheaterSeat.bookSeat(seats);
	}
	
	public static void main(String args[])
	{
		bookTheaterSeat=new BookTheaterSeat();
		
		MovieBookApp movie=new MovieBookApp();
		movie.seats=7;
		movie.start();
		
		MovieBookApp movie2=new MovieBookApp();
		movie2.seats=6;
		movie2.start();
	}
}
