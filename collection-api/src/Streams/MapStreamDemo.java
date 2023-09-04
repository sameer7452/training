package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {
		
		Map<String,String> people = new HashMap<>();
		people.put("polo","Pune");
		people.put("mili","Mumbai");
		people.put("deni","Delhi");
		
		people.values().stream().forEach(System.out::println);
		
		List<String> cities=people.values().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		List<String> name=people.keySet().stream().map(c->c.toUpperCase()).sorted().collect(Collectors.toList());
		name.forEach(System.out::println);
		
		
		
	}
}
