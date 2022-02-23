package java220223;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("cherry", "kiwi", "strawberry", "apple"));
        String removedFruit = fruits.remove(0);
        System.out.println(removedFruit + "is removed.");

        fruits.remove("kiwi");
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}