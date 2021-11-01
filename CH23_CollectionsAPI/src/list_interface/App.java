package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// ArrayList와 LinkedList는 리스트 인터페이스를 구현
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(4);
		
		displayList(numbers);
		

	}
	private static void displayList(List<Integer> list) {
		// 매개 변수로 리스트 객체를 입력받아 리스트 내용을 전부 출력
		list.forEach(System.out::println);
	}

}
