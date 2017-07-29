package com.pavikumbhar.javaheart.java8;

import java.util.Arrays;
import java.util.List;

public class MapInParallel {
	  public static void printThreadInfo(int number) {
		    System.out.println("called for " + number + " from " + Thread.currentThread());    
		  }                   
		  
		  public static boolean isEven(int number) {
		    printThreadInfo(number);
		    return number % 2 == 0;
		  }
		  
		  public static int doubleIt(int number) {
		    printThreadInfo(number);
		    return number * 2;
		  }                                     
		  
		  public static void main(String[] args) {
		    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		    numbers.parallelStream()
		           .map(MapInParallel::doubleIt)
		           .forEach(System.out::println);
		  }  
}
