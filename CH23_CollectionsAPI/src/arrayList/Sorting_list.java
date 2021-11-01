package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// 리스트를 정렬
		//실수타입 리스트 생성
		ArrayList<Double> doubles = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(4.23);
		doubles.add(2.24);
		doubles.add(8.25);
		doubles.add(1.19);
		
		list.add(9);
		list.add(119);
		list.add(54);
		list.add(22);
		list.add(654);
		
		Collections.sort(doubles); //정렬
		Collections.sort(list);
		
		doubles.forEach(System.out::println);
		System.out.println();
		list.forEach(System.out::println);
		
		//커스텀 객체 정렬
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("램스데일"));
		people.add(new Person("레노"));
		people.add(new Person("홀딩"));
		people.add(new Person("챔버스"));
		
		people.forEach(System.out::println);
		
		Collections.sort(people);
		System.out.println();
		
		people.forEach(System.out::println);
		
	}

}
