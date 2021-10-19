package defaultConstructor;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("Bukayo");
		System.out.println(p2);
		Person p3 = new Person("Ben", 23);
		System.out.println(p3);

	}

}
