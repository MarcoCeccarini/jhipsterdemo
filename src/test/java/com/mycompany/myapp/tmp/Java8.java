package com.mycompany.myapp.tmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Java8 {

	public class Fruit {

		
		private String name;
		private Gender gender;

		public Fruit(String name) {
			this.name = name;
		}
		
		public Fruit(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public Optional<Fruit> find(String name, List<Fruit> fruits) {
		for (Fruit fruit : fruits) {
			if (fruit.getName().equals(name)) {
				return Optional.of(fruit);
			}
		}
		return Optional.empty();
	}

	public void optional() {

		List<Fruit> fruits = Arrays.asList(new Fruit("apple"), new Fruit(
				"grape"), new Fruit("orange"));

		Optional<Fruit> found = find("lemon", fruits);
		if (found.isPresent()) {
			Fruit fruit = found.get();
			String name = fruit.getName();
		}

	}

	public void fruits() {
		List<Fruit> list = new ArrayList<Fruit>();

		list.add(new Fruit("Louise", Gender.FEMALE));
		list.add(new Fruit("Tobias", Gender.MALE));
		list.add(new Fruit("Mike", Gender.MALE));
		list.add(new Fruit("Mike", Gender.MALE));
		list.add(new Fruit("John", Gender.MALE));
		list.add(new Fruit("John", Gender.MALE));
		list.add(new Fruit("Anna", Gender.FEMALE));

		System.out.println(">>>>  List all employees");
		
		list.forEach(System.out::println);
		
		
		 Function<Fruit, Fruit> morpher = fruit -> {
			 fruit.setName(fruit.getName().concat("x"));
	            return fruit;
	        };
	        System.out.println("derived from person " + morpher.apply(list.get(0)).getName());
	}

	public void sortLambda(){
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return b.compareTo(a);
		    }
		});
		
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		Collections.sort(names, (a, b) -> b.compareTo(a));
		
	}
	
	
	public static void main(String[] args) {
		Java8 java8 = new Java8();
		java8.optional();
		
		java8.fruits();
	}

}
