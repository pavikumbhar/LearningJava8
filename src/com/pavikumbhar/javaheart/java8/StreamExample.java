package com.pavikumbhar.javaheart.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	 public static void main(String[] args) {
		    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		    List<Integer> doubled = 
		      values.stream()
		            .map(e -> e * 2)
		            .collect(Collectors.toList());
		            
		    System.out.println(doubled);
	 }
}
