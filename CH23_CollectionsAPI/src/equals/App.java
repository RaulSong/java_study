package equals;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object other) {
		String a = "abc";
		String b = "def";
		a.equals(b);
		
		if(other == null) return false;
		if(other == this) return false;
		if(!(other instanceof Person)) return false;
		if(this.name == null) return false;
		Person p = (Person)other;
		if(p.name == null) return false;
		
		return this.name.equals(p.name);
	}
	
}

public class App {
	public static void main(String[] args) {
		//equals ¸Þ¼Òµå
		Person p1 = new Person("Æë¼ö");
		Person p2 = new Person("Æë¼ö");
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));

	}

}
