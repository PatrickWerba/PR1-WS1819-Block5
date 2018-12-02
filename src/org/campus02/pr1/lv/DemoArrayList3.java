package org.campus02.pr1.lv;

import java.util.ArrayList;

public class DemoArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(34);
		numbers.add(42);
		numbers.add(-1);
		
		System.out.println(numbers);
		System.out.println("num elements: "+numbers.size());
		
		System.out.println("contains 17 ? "+numbers.contains(17));
		System.out.println("contains 42 ? "+numbers.contains(42));
		
		Integer num2 = numbers.get(1);
		System.out.println("2. Zahl: "+num2);
		
		numbers.remove(0);
		System.out.println("num elements: "+numbers.size());
		
		System.out.println(numbers);
		
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
	}

}
