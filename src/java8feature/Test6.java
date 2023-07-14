package java8feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {
		
		String str = "aashish";
		
		//1.revers tring
		//count of each char a:2s:2h:2i:1
	
		//List = 10,20,30,40,50
				//>25
	            // 120
		
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int sum = list.stream().filter(a->a>25).map(a->a).collect(Collectors.summingInt(a->a));
		System.out.println(sum);
		

		
		String strnew = "";
		 for (char c : str.toCharArray()) {
			
			 strnew = c+strnew;
			 
		}
		 System.out.println(strnew);
		
		
		char[] ch = str.toCharArray();
				        
		Map<Character,Integer> map = new HashMap();
		for (char c : ch) {
		   if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);	
			}else {
				map.put(c,1);
			}
        	
		}
		
		
		//Set<Entry>map.entrySet();
		
		for (Entry<Character, Integer> c : map.entrySet()) {
			 System.out.print(c.getKey()+":"+c.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
