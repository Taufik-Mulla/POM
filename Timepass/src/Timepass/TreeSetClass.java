package Timepass;

import java.util.*;

public class TreeSetClass {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(85);
		numbers.add(96);
		numbers.add(57);
		numbers.add(75);
		numbers.add(75);

		System.out.println("Treeset Elements (sorted):" + numbers);
		
		System.out.println("First Element:"+((TreeSet <Integer>) numbers).first());
		System.out.println("Last Element:"+((TreeSet <Integer>) numbers).last());

	}
}