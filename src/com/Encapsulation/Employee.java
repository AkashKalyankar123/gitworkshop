package com.Encapsulation;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serailVersionUID=1L;

	private int id;
	private String name;
	private String address;
	private int salary;
	private int deptId;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String address, int salary,int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.deptId=deptId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", deptId="
				+ deptId + "]";
	}
	
	
	
	
	




}
