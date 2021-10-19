package methodOverloading;

public class App {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.greet();
		person.greet("Aubameyang");
		person.greet("Holding", 190);
	}

}
