package constructor;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Arteta");
		p1.setHeight(183.0);
		
		Person p2 = new Person();
		p2.setName("Mari");
		p2.setHeight(187.0);
		
		Person p3 = new Person();
		p3.setName("Tierney");
		p3.setHeight(179.0);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());

	}

}
