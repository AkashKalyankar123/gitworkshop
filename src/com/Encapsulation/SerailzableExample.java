package com.Encapsulation;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerailzableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Akash");
		emp.setAddress("Pune");
		emp.setDeptId(103);
		emp.setSalary(120023);
		System.out.println("EmpId :"+ emp.getId()+"EmpName :"+ emp.getName());
		Employee emp2=new Employee();
		emp2.setId(103);
		emp2.setName("Akash");
		emp2.setAddress("Pune");
		emp2.setDeptId(103);
		emp2.setSalary(120023);

		
		
		
		System.out.println("EmpId :"+ emp2.getId()+"EmpName :"+ emp2.getName());
		System.out.println("EmpId :"+ emp2.getId());
	//	System.out.println("EmpId :"+ emp2.getId(emp.setId(103))+"EmpName :"+ emp2.getName());
		
//		//serialization
//		
//		FileOutputStream fileOutputStream=new FileOutputStream("D:\\serizlizable\\abc.ser");
//		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(emp);;
//		objectOutputStream.close();
//		fileOutputStream.close();
//		
//		//Deserialization
//		
//		FileInputStream fileInputStream=new FileInputStream("D:\\serizlizable\\abc.ser");
//		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//		Employee employee=(Employee)objectInputStream.readObject();
//		System.out.println(employee.getName());
//		objectInputStream.close();
//		fileInputStream.close();
//		

	}

}
