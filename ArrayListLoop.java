package java220223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLoop {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Cherry", "Orange", "Apple", "Kiwi"));
		
		// for-each loop
		for(String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println();
		
		// for loop
		for(int i=0; i<fruits.size(); i++) {
			System.out.print(fruits.get(i) + " ");
		}
		System.out.println();
		
		// iterator
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		// listIterator
		ListIterator<String> listIterator = fruits.listIterator(fruits.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
	}
}