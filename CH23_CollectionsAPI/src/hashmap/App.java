package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// �ؽø��� ����(�ε���)�� ���� Ű ������ �ε��� ��ü
		HashMap<Integer, String> people = new HashMap<>();
		//���� �Է½� ���� 2��(key,value)�̱� ������ add�� �ƴ϶� put
		people.put(0, "��ī��Ʈ");
		people.put(1, "���ٸ޾�");
		people.put(3, "����Ƽ��");
		people.put(4, "�߷α�");
		people.put(4, "����");
		people.put(10, "��ī");
		
		people.forEach((k,v)-> {
			System.out.println(k+ ": " + v);
		});
		//Ű ���� �ش��ϴ� ���� ��������
		System.out.println(people.get(4));
		System.out.println(people.get(10));
		
	}

	
}
