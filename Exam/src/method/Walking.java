package method;

public class Walking {

	public static void main(String[] args) {
		//1.Į�θ� ����� ���� �޼ҵ� ȣ��
		calculateCalory(5000);
		//3.��� ���
		double result = calculateCalory(5000);
		System.out.println("�Ҹ� Į�θ� : " + result + "kcal");

	}
	//2.Į�θ� ��� �޼ҵ� ����
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}

}
