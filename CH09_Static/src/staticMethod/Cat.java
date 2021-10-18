package staticMethod;

public class Cat {
	private String name; //����� �̸�
	private int id; //����� ���̵�
	private static int count = 0; //������ ������� ����
	public static final String FOOD = "����� ���";
	//����ƽ ������ ��ü���� ���� ����
	
	public Cat(String name) { //�����ڴ� ���� Ÿ���� ����(�Ϲ� �޼ҵ�� �ٸ�)
		this.name = name;
		//�ڵ� �߰�
		count++; //����� ��ü ������ ����ƽ count�� +1
		id = count;
	}

	@Override
	public String toString() { //toString �޼ҵ� �ڵ����� (alt+shift+s)
		return "����� [���̵� = " + id + ", �̸� : " + name + "]";
	}
	public static int getCount() {
		//String n = name; ����ƽ �޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����
		return count;
	}
	
}
