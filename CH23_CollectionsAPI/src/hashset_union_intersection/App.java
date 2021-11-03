package hashset_union_intersection;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// �ؽ��� ������ ������
		HashSet<String> fruits1 = new HashSet<>();
		fruits1.add("���");
		fruits1.add("��");
		fruits1.add("����");
		fruits1.add("����");
		
		HashSet<String> fruits2 = new HashSet<>();
		fruits2.add("ü��");
		fruits2.add("��");
		fruits2.add("���");
		fruits2.add("������");
		
		//������ ����Ʈ�� �����
		//�����ڿ� ()�ȿ� ����Ʈ�� ������ ����Ʈ�� ��� ���� �Էµ� ����Ʈ�� ����
		HashSet<String> union = new HashSet<>(fruits1);

		union.forEach(System.out::println);
		
		union.addAll(fruits2);	//���� ����Ʈ�� fruits2 ����Ʈ�� ��ħ
		
		System.out.println("***������");
		union.forEach(System.out::println);
		
		//������ ����Ʈ �����
		HashSet<String> intersection = new HashSet<>(fruits1);
		intersection.retainAll(fruits2);	//ù��° ����Ʈ�� �ι�° ����Ʈ�� ���� �����۸� ����
		
		System.out.println("***������");
		intersection.forEach(System.out::println);
		
		//���̳ʽ� A - B : �ι�° ����Ʈ�� ���� ���� ������
		HashSet<String> minus = new HashSet<>(fruits1);
		minus.removeAll(fruits2);
		
		System.out.println("***fruits1 - fruits2");
		minus.forEach(System.out::println);
		
	}

}