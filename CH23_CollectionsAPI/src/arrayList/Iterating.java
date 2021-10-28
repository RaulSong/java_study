package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		//�ݺ������� �ڷḦ ������ ���
		ArrayList<Integer> list = new ArrayList<>();
		//�Է�
		list.add(7);
		list.add(10);
		list.add(123);
		list.add(999);
	
		//for each
		for(Integer n : list) {
			System.out.println(n);
		}
		//for �ݺ���(�ε��� ��ȣ�� ���� ���� ����)
		for(int i=0; i<list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("�ε��� "+i + " : " + n);
		}
		System.out.println();
		//����Ʈ.forEach �޼ҵ� ���ٽ�
		list.forEach(e -> System.out.println(e));
		//�޼ҵ� ���۷���
		list.forEach(System.out::println);
	
	}

}
