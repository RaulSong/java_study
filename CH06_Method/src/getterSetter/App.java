package getterSetter;

public class App {

	public static void main(String[] args) {
		// ���������� private�� ���� class������ ���� ����
		Person p1=new Person();
		//p1.name="Saka"
		//p1.age=21
		p1.setName("Saka");
		p1.setAge(21);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
