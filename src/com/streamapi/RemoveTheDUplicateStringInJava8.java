package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheDUplicateStringInJava8 {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Akash","Rohit","Akash");
		
		str.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		//System.out.println(removeElement);

	}

}
