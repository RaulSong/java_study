package applications;

public class Printf {

	public static void main(String[] args) {
		// ������� printf("��¼���(%d, %f, %c, %s)", ����� ��)
		int age = 25;
		String addr = "�λ�";
		
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n", age);
		System.out.printf("�� ���̴� %d���̰�, %s�� ��� �ֽ��ϴ�.\n", age, addr);

		double pi = 3.14592; 
		System.out.printf("������ ���� : %f", pi);
		System.out.printf("������ ���� : %.2f", pi);//�Ҽ��� �ڸ��� .n���� ǥ��
	}

}
