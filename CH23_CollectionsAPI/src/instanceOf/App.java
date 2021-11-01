package instanceOf;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature { 
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {
		// ��ü�� Ÿ���� �Ǻ���
		Creature c1 = new Creature();
		Object c2 = c1; //Object�� �ֻ��� Ŭ���� Ÿ������ ��� Ŭ���� Ÿ�Կ��� ���� ����
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Serializable);
		System.out.println(c2 instanceof Creature);
		System.out.println(c2 instanceof Cat);
	
	}

}
