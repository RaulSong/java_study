package methodOverloading;

public class Person {
	//�޼ҵ� �����ε� -> �޼ҵ� �̸��� ������, �Ű�����(parameter)�� �ٸ� ���
	public void greet() {
		System.out.println("���~");
	}
	public void greet(String name) {
		System.out.println("���! " + name);
	}
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("Ű�� ũ����.");
		}
		System.out.println("���! " + name);
	}
}
