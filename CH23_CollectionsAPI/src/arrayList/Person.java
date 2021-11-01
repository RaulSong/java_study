package arrayList;

//정렬이 가능하도록 Comparable 인터페이스를 구현한다.
public class Person implements Comparable<Person>{
	private String name;	
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
}
