package constructorParameter;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("Xhaka", 186.0);
		Person p2 = new Person("Martinelli", 182.0);
		Person p3 = new Person("White", 188.0);
		Person p4 = new Person();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}
