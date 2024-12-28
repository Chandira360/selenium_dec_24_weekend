package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList();
		
		numbers.add(27);
		numbers.add(27);
		numbers.add(29);
		numbers.add(32);
		numbers.add(25);
		numbers.add(27);
		System.out.println(numbers);
		numbers.add(3,30);
		System.out.println(numbers);
		
		numbers.remove(1);
		
		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		Collections.sort(numbers);// order based on Ascii order
		System.out.println(numbers);
		
		List<Integer> num = new LinkedList();
		System.out.println(num);
		num.addAll(numbers);
		System.out.println(num);
		num.addAll(3, numbers);
		System.out.println(num);
		System.out.println(num.size());
		System.out.println(num.get(0));
		
	}
	
}
