import school.Student;

public class App {

	public static void main(String[] args) {

		Student s1 = new Student("Saka", 21, true, 36.5);
		Student s2 = new Student("ESR", 22, true, 36.3);
		Student s3 = new Student("Lacazette", 29, false, 36.1);
		Student s4 = new Student();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
