package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// ArrayList�� LinkedList�� ����Ʈ �������̽��� ����
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(4);
		
		displayList(numbers);
		

	}
	private static void displayList(List<Integer> list) {
		// �Ű� ������ ����Ʈ ��ü�� �Է¹޾� ����Ʈ ������ ���� ���
		list.forEach(System.out::println);
	}

}
