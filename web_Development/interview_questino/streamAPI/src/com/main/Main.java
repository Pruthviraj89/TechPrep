package com.main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

//import static com.main.FPO2Functional.addListFunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<Integer> l1= new ArrayList<>();
		
		l1.add(3);
		l1.add(4);
		l1.add(8);
		l1.add(4);
		l1.add(9);
		
		int result=addListFunctional(l1);
		
		System.out.println(result);
		*/
		/*
		
		Stream<String> stream=Stream.of("Apple","Bannana");
		stream.forEach(System.out::println);
		*/
		
		/*
		Stream<Double> randomVal=Stream.generate(Math::random).limit(5);
		randomVal.forEach(System.out::println);
		*/
		
		//int a[] = {4,5,7,9,10,45};
		
		
		/*
		List<Integer> list1= Arrays.asList(4,5,7,9,10,45);
		
		List<Integer> list2= list1.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		
		list2.forEach(System.out::println);
		*/
		
		List<String> list1= Arrays.asList("Pruthviraj","Payal","Pranjal","Pratik","priya","Prashant","Pruthviraj");
		
		/*
		List<Boolean> list2= list1.stream().map(
				(x)->x.length()==5).collect(Collectors.toList());
		
		
		List<String> list2=list1.stream().distinct.toList();
		
		
		
			List<String> list2=list1.stream().filter((x)->{
			if(x.length()%2==0)
				return true;
			else
				return false;
		}).toList();
	*/
		
		/* --------------------------Important --------------------------
		List<String> list2=list1.stream().map((String x)->{
			
			if(x.length()==5)
				return x;
			else
				return null;
			
		}).filter(x->x!=null).toList();
		
		*/
		
		Predicate<Integer> isEvenPredicate= x->x%2==0;
		
		
	
		List<Integer> list2= Arrays.asList(4,5,7,9,10,45);
		
		list2=list2.stream().filter(isEvenPredicate).toList();
		
		
		
	
		 
	
		
		list2.forEach(System.out::println);
					
		/*
		 * Important point:
		 *Stream not store data
		 *stream are lazy,
		 *stream are immutable
		 *stream cannot be reused once it is consumed; 
		 *
		 *
		 *  ------------------Important Functional Interface------------introduce in java 8
		 *  
		 *  Consumer  void accept(T t)	
		 *  predicate boolean test(T t)
		 *  function R apply(T t)
		 *  Suppliers T get()
		 *
		 *
		 *
		 * 
		 * 
		 * Intermediate Operations:
		 * filter()
		 * map( R Function<T>)
		 * distinct()
		 * sorted()
		 * limit(n)
		 * skip(n)
		 * takeWhile(predicate)
		 * dropwhile(predicate)
		 * 
		 * 
		 * 
		 * Terminal Operation
		 * forEach()
		 * collect()
		 * reduce() : combines element to produce a single result
		 * count()
		 * findFirst()
		 * findAny()
		 * anyMatch()
		 * allMatch()
		 * noneMatch()
		 * toList()
		 * 		
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}

}
