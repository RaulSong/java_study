package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		// key : Person, value : true,false(원격수업 여부)
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		InputMap(people1);
		displayMap(people1);
		
		InputMap(people2);
		displayMap(people2);
		
		//트리맵은 정렬을 해야하는데 키값인 person객체가 비교할 수 있는 메소드가 없음->Comparable 인터페이스 추가
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
		map.put(new Person("마갈량이스"), true);
		map.put(new Person("화이트"), true);
		map.put(new Person("마리"), false);
		map.put(new Person("홀딩"), false);
		map.put(new Person("마리"), false);
		map.put(new Person("홀딩"), true);
	}
}
