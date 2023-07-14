package java8feature;

import java8feature.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<>();
	    list.add( new User(101, "Lokesh",30) );
	    list.add( new User(102, "Alex", 20) );
	    list.add( new User(500, "Brian", 40) );
	    list.add( new User(502, "Neon", 30) );
	    list.add( new User(301, "David", 43) );
	    list.add( new User(710, "Alex", 50) );
	    list.add( new User(604, "Brian", 80) );
	    
	    Comparator<User> cmpare = Comparator.comparing(User::getName).thenComparing(User::getAge).thenComparing(User::getRollno);
	    
	    list.stream().sorted(cmpare).collect(Collectors.toList()).forEach(a->System.out.println(a.name+" "+a.rollno+" "+a.age));
		
		
	}

}
