package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// ���ٽ� ������ ����Ʈ�� ����غ���
		List<String> list = new ArrayList<>();
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		//����Ʈ�� forEach �޼ҵ��� �Ű������� Consumer�������̽� ��ü�̴�
		//�������̽��δ� ��ü�� ���� �� ���� ������ �͸� Ŭ������ ����� �߻�޼ҵ带 �ϼ���
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// Consumer �������̽��� �߻� �޼ҵ� (������ �ؾ���)
				System.out.println(t);
				System.out.println(" ");
			}
		});
		//���ٽ����� ������
		list.forEach(s->System.out.println(s));
	}

}
