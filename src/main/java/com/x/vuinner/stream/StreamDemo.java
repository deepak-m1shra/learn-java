package com.x.vuinner.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> arrayList = Arrays.asList("Contains number 13123", "contains %", "contains ___", "null");

		arrayList.stream().filter(d -> d.contains("13123")).forEach(System.out::println);

		Runnable r1 = () -> System.out.println("helloooooooo");

//		r1 = () -> System.out.println(x+y);

		r1.run();

		// Demo to iterate elements of different collection types using lambda
		// expression

//		FileReader fr = new FileReader(file);
		arrayList.forEach((a) -> System.out.println(a));

		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "deepak");
		map.put("empId", 76799);
		map.put("company", "Intelliswift software");

		map.forEach((k, v) -> System.out.println("key: " + k + ", Value: " + v));
		map.forEach((k, v) -> System.out.println("key: " + k + ", Value: " + v));

		// Multiply each element of the array by itself
		List<Integer> list = Arrays.asList(3, 6, 9, 12, 15, 18, 21);

		list.stream().map(number -> number * number).forEach(System.out::println);

		// Convert lowercase letters to uppercase

		List<String> lowerList = Arrays.asList("a", "b", "c", "d", "e", "f");

//		lowerList.stream().sorted((a)-> );

//		lowerList.stream().map(String::toUpperCase).forEach(System.out::print);

		List<String> lowerListFinal = lowerList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("lowercase list: " + lowerListFinal);

	}

	@Test
	public void create_stream_ways() {
		// Creating integer stream

		Stream<Integer> streamInt = Stream.of(1, 2, 3, 4, 5);
//		streamInt.forEach(i -> System.out.println(i));

		// Creating string streams
		Stream<String> stringStream = Stream.of("India", "Japan", "USA", "UK");
		stringStream.forEach(item -> System.out.println(item));

		// Generating a stream
		Stream<String> genStream = Stream.generate(() -> {
			return "abc";
		});

//		Stream<String> streamIterate = Stream.iterate("abc", i -> i);

		// Generates infinite stream
		// genStream.forEach(a -> System.out.println(a));

//		streamIterate.forEach(item -> System.out.println(item));

		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 });
		LongStream longStream = Arrays.stream(new long[] { 1, 2, 3, 4, 5, 6 });

		// Converting stream to a collection

		List<Integer> integerList = streamInt.collect(Collectors.toList());
		
		System.out.println("printing integerList " + integerList);

	}

}
