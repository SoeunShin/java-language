// programmers 12910에서 사용된 ArrayList에 관련된 예시 1

package java220223;

import java.util.ArrayList;

public class ArrayListTest {		// class 이름을 ArrayList로 설정하면 에러가 난다. 주의!!
	public static void main(String[] args) {
    	ArrayList<String> fruits = new ArrayList();
		
        // add() method 사용하여 원소 추가
        fruits.add("orange");
        fruits.add("strawberry");
        fruits.add(0, "cherry");	// index 0번째에 cherry 추가
        fruits.add("apple");
       
        // set() method 사용하여 원소 변경
        fruits.set(1, "kiwi");		// index 1번째 원소를 kiwi로 수정
        
        System.out.println(fruits);
    }
}