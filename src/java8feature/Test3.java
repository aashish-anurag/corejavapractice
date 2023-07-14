package java8feature;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,15,8,49,26,98,98,32);
		
		// print even number
		
		list.stream().filter(e->e%2==0).forEach(System.out::println);
		System.out.println("===================================");
		list.stream().map(s->s+"").filter(e->e.startsWith("1")).forEach(System.out::println);
		System.out.println("===================================");
		Set<Integer> set = new HashSet<>();
        list.stream().filter(e -> !set.add(e)).forEach(System.out::println);
        System.out.println("==============================First Element :=====");
        list.stream().findFirst().ifPresent(System.out::println);
        int i =list.stream().findFirst().get();
        System.out.println("======i="+i);
        
        Long list2 = list.stream().collect(Collectors.counting());
        System.out.println("list2= "+list2);
        System.out.println("list count = "+list.stream().count());
        System.out.println("==============================MAX Element :=====");
        list.stream().max((x,y)->x.compareTo(y)).ifPresent(System.out::print);
        System.out.println("==============================Min Element :=====");
        list.stream().min((x,y)->x.compareTo(y)).ifPresent(System.out::print);
        
        String str = "Java articles are awesome";
        System.out.println("==============================non repeat char :=====");
        str.chars().mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
        .stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().ifPresent(System.out::print);
        
        System.out.println("==============================repeat char :=====");
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
        .map(e->e.getKey()).findFirst().ifPresent(System.out::println);

        System.out.println("==============================list in sorted :=====");

        list.stream().sorted().forEach(System.out::println);
        System.out.println("==============================list in sorted in reverse order :=====");
        list.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.print(e+" "));
        
        System.out.println("==============================if any value repeat then true else false :=====");
       int setsize = list.stream().collect(Collectors.toSet()).size();
       
       /*if(setsize == list.size()) {
    	   return false;
       }else {return true;}
       */
       
       System.out.println("=======cube on list elements and filter numbers greater than 50. :=====");
       
       list.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);
       
       System.out.println("======= find only duplicate elements with its count from the String ArrayList in Java8 :=====");
       List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
       
      Map<String,Long> map =  names.stream().filter(e->Collections.frequency(names, e)>1).collect(Collectors.groupingBy(a->a,Collectors.counting()));
       System.out.println("Duplicate element with count= "+map);
       
       

       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		

		
	}

}
