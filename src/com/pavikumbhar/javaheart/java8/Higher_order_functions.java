package com.pavikumbhar.javaheart.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Higher_order_functions {
	public static int totalValues(List<Integer> values, Predicate<Integer> selector) {
		return values.stream().filter(selector).mapToInt(e -> e).sum();
	}

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, Higher_order_functions::isEven));
		System.out.println(totalValues(values, Higher_order_functions::isOdd));
		System.out.println(totalValues(values, e -> e > 3));
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
