package application;

public class App {

	public static void main(String[] args) {
		// ����� Ŭ���� �ҷ�����
		Cat cat1 = new Cat("���");
		Cat cat2 = new Cat("����");
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		//����ƽ ������ ��ü�� ������� 'Ŭ������.������'�� ����Ѵ�. ��ü ���� �ҿ�
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		System.out.println(cat1.getCount());
		System.out.println(cat2.getCount());
		
		Cat cat3 = new Cat("ĳ��");
		System.out.println(cat3.getCount());
	}

}
