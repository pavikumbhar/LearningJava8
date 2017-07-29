package com.pavikumbhar.javaheart.java8;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class HigherOrderFunaction {
//  public static boolean isPrime(int number) {
//  if(number > 1) {
//    for(int i = 2; i < number; i++) {
//      if(number % i == 0)
//        return false;
//    }
//    return true;
//  }
//  return false;
//}

public static boolean isPrime(int number) {
  IntPredicate indexDividesNumber = i -> number % i == 0;
 		 return number > 1 && IntStream.range(2, number).noneMatch(indexDividesNumber);
}

public static void main(String[] args) {
  for(int i = 1; i <= 10; i++) {
    System.out.printf("%d is prime? %b\n", i, isPrime(i));
  }
}

}
