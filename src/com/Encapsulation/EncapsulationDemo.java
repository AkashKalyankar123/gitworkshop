package com.Encapsulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Rohan","pune",4000,101));
		list.add(new Employee(102,"Kumar","Kolhapur",3000,101));
		list.add(new Employee(103,"Jagdish","Chennai",6000,102));
		list.add(new Employee(104,"Rohit","Solapur",3500,102));
		list.add(new Employee(105,"Soham","pune",4500,103));
		
		//write program to print employee details working each department
		Map<Integer, List<Employee>> empListBasedOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee:: getDeptId,Collectors.toList()));
		
		empListBasedOnDept.entrySet().forEach(e->{
			System.out.println(e.getKey()+"---"+e.getValue());
		});
		
	/*	//write program to print employees count working in each department
		Map<Integer, Long> employeeCountDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		employeeCountDept.entrySet().forEach(e->{
			System.out.println(e.getKey()+"--"+e.getValue());
		});
		
		//write program to print max/min employee salary from the each given collection
		
		Optional<Employee> maxSalary = list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Maximum salary for employee :"+ maxSalary);
		
		Optional<Employee> minSalary = list.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Minimum salary for employee :" + minSalary);
		
		//write a program to print the max salary of a employees from each department
		
		Map<Integer, Optional<Employee>> toSalaryEMpDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptId,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		
		toSalaryEMpDept.entrySet().forEach(e->{
			System.out.println(e.getKey()+"---"+e.getValue());
		});
		*/
		
		
		
	}

}
