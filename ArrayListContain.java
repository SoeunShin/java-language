package java220223;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListContain {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Cherry", "Orange", "Apple", "Kiwi"));
		boolean contains = fruits.contains("Orange");	// 값이 존재하면 true, 존재하지 않으면 false를 리턴
		System.out.println(contains); 
		
		int index = fruits.indexOf("Orange");	// 값이 존재하는 경우 
		System.out.println(index);
		
		index = fruits.indexOf("Banana");		// 값이 존재하지 않는 경우 
		System.out.println(index);
	}
}