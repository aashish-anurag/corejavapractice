package java8feature;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		//largest number from list
		
		Arrays.asList(10,80,20,3,60).stream().max(Integer::compare).get();
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> list2 = Arrays.asList();

		
		Long count = list.stream().filter(n-> n%2 == 0).count();
		System.out.println("count = "+count);
		
		
		//sum after filter value low than 10
		int su = list.stream().filter(n->n<10).mapToInt(a->a).sum(); System.out.println("Sum= "+su);
		
		list2.stream().findFirst().ifPresent(System.out::println);
		
		list.stream().forEach(n->System.out.println("list of data : "+n));
		
		list.stream().filter(n->n<20).map(n->n).collect(Collectors.toList()).forEach(n->System.out.println("filtered data: "+n));
		
		
		
		
		//Programm to count the occurrance of charater
		String str = "abcdcndmjkb";
		
		 // str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet();
		
		  Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		   map.forEach((k,v)->{
			   if(v > 1) {
				   System.out.println(k+" "+v);
			   }
		   });
	    
	   /* 
	    	System.out.println("Stream without terminal operation");

	     Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	        System.out.println("doubling " + i);
	        return i * 2;
	    });
	 
	    System.out.println("Stream with terminal operation");
	        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	            System.out.println("doubling " + i);
	            return i * 2;
	    }).sum();
		
		// TODO Auto-generated method stub
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));

		List<String> phones = people.values().stream()
		  .flatMap(Collection::stream)
		    .collect(Collectors.toList());*/
		
	}

}
