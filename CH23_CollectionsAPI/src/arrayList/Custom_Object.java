package arrayList;

import java.util.ArrayList;


public class Custom_Object {

	public static void main(String[] args) {
		// 리스트에 커스텀 객체 입력
		// people 리스트에는 Person 타입 객체가 입력됨
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("사카"));
		people.add(new Person("스미스로우"));
		people.add(new Person("토미야스"));
		people.add(new Person("티어니"));
		
		people.forEach(System.out::println);
		
		people.set(1, new Person("외데고르"));
		System.out.println();
		people.forEach(System.out::println);
	}

}
