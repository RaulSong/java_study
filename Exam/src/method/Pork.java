package method;

public class Pork {

	public static void main(String[] args) {
		// 1.������ �����Ͻÿ�.
		int pork = 3;
		// 2. �޼ҵ带 ���� Į�θ��� ����Ͻÿ�.
		double result = calculateCalory(3);
		// 3. ����� ����Ͻÿ�
		System.out.println("���� 3�κ� : " + result + "kcal");
	}
	//4. Į�θ� ����� ���� �޼ҵ带 �ۼ��Ͻÿ�
	private static double calculateCalory(int pork) {
		return 180 * 5.179 * pork;
	}
}
