package arrayList;

import java.util.ArrayList;


public class Custom_Object {

	public static void main(String[] args) {
		// ����Ʈ�� Ŀ���� ��ü �Է�
		// people ����Ʈ���� Person Ÿ�� ��ü�� �Էµ�
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("��ī"));
		people.add(new Person("���̽��ο�"));
		people.add(new Person("��߽̾�"));
		people.add(new Person("Ƽ���"));
		
		people.forEach(System.out::println);
		
		people.set(1, new Person("�ܵ���"));
		System.out.println();
		people.forEach(System.out::println);
	}

}
