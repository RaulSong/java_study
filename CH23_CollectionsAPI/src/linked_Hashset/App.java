package linked_Hashset;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// linked hashset : �ߺ� ���� �ʰ� �Էµ� ������� ���
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("��");
		fruits.add("���");
		fruits.add("���");
		
		System.out.println(fruits.contains("������")); //������ true ������ false
		
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}
