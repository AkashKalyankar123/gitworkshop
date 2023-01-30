package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapIncreaseSalary {

	//final static Double INCREMENT_SALARY=0.1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employess=Arrays.asList(
				new Employee(101, "Akash Kalyankar", 100000),
				new Employee(102, "Rohit kumar", 60000),
				new Employee(123, "Suraj kumar", 23400),
				new Employee(143, "Jon", 120000)
				);
		
		List<Employee> emp= employess.stream().map(e->{
			e.setSalary(e.getSalary()*1.10);
			return e;
		}).collect(Collectors.toList());
		
		System.out.println(emp);
		
	
	}
	

}
