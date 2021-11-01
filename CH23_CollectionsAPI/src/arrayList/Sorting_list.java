package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_list {

	public static void main(String[] args) {
		// ����Ʈ�� ����
		//�Ǽ�Ÿ�� ����Ʈ ����
		ArrayList<Double> doubles = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		doubles.add(7.38);
		doubles.add(4.23);
		doubles.add(2.24);
		doubles.add(8.25);
		doubles.add(1.19);
		
		list.add(9);
		list.add(119);
		list.add(54);
		list.add(22);
		list.add(654);
		
		Collections.sort(doubles); //����
		Collections.sort(list);
		
		doubles.forEach(System.out::println);
		System.out.println();
		list.forEach(System.out::println);
		
		//Ŀ���� ��ü ����
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("��������"));
		people.add(new Person("����"));
		people.add(new Person("Ȧ��"));
		people.add(new Person("è����"));
		
		people.forEach(System.out::println);
		
		Collections.sort(people);
		System.out.println();
		
		people.forEach(System.out::println);
		
	}

}
