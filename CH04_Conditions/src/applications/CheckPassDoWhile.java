package applications;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// �н����带 �Է¹޾� do while ������ �´��� �˻�
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "Arsenal";
		
		String password = "";
		do {
			System.out.print("��й�ȣ �Է� : ");
			password = scanner.nextLine(); //���� ��ȣ�� ������ ��� .nextInt
			
		}while (!password.equals(USER_PASSWORD)); // '!'�� �ݴ�
		
		 scanner.close();
		 System.out.println("���� ����.");
	}

}
