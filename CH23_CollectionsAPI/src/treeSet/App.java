package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Person other) {
		// 트리셋이 정렬을 할 수 있도록 비교방법을 코드로 작성
		return this.name.compareTo(other.name);
	}
}
	

public class App {
	public static void main(String[] args) {
		// 트리셋은 정렬 기능 추가
		TreeSet<Person> people = new TreeSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		people.add(new Person("스미스로우"));
		people.add(new Person("파티"));
		people.add(new Person("로콩가"));
		people.add(new Person("자카"));
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(7);
		numbers.add(3);
		
		for(Person p : people) {
			System.out.println(p);
		}
		for(Integer n : numbers) {
			System.out.println(n);
		}		
	}
}
