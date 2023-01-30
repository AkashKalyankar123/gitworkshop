package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101,"Akash",34000));
		emp.add(new Employee(131,"Rohit",30000));
		emp.add(new Employee(194,"Rohan",50000));
		emp.add(new Employee(131,"kumar",307000));
		
		Optional<Employee> employess = emp.stream()
				.sorted(Comparator.comparingDouble(Employee :: getSalary)
						.reversed()).skip(1).findFirst();
		
		System.out.println(employess.get());
		
		
		
	}

}
