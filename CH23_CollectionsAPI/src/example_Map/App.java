package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// key : Person, value : true,false(���ݼ��� ����)
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		InputMap(people1);
		displayMap(people1);
		
		InputMap(people2);
		displayMap(people2);
		
		//Ʈ������ ������ �ؾ��ϴµ� Ű���� person��ü�� ���� �� �ִ� �޼ҵ尡 ����->Comparable �������̽� �߰�
		InputMap(people3);
		displayMap(people3);

	}

	private static void displayMap(Map<Person, Boolean> map) {
		// TODO Auto-generated method stub
		map.forEach((k,v) -> System.out.println(k+": " +v));
		System.out.println();
	}
	private static void InputMap(Map<Person, Boolean> map) {
		// TODO Auto-generated method stub
		map.put(new Person("�������̽�"), true);
		map.put(new Person("ȭ��Ʈ"), true);
		map.put(new Person("����"), false);
		map.put(new Person("Ȧ��"), false);
		map.put(new Person("����"), false);
		map.put(new Person("Ȧ��"), true);
	}
}
