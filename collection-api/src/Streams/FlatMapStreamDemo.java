package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapStreamDemo {
	public static void main(String[] args) {
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Sean", Arrays.asList("1212-3534","5666-7888","8989-5050"));
		contacts.put("Ben", Arrays.asList("1112-3334","5556-7778"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		System.out.println("lucky members");
		List<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(c->c.contains("8")).collect(Collectors.toList());
		lucky.forEach(System.out::println);
	}

}
