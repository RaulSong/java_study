package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//�Է�
		list.add(7);
		list.add(10);
		list.add(123);
		list.add(999);
		//���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

	}

}
