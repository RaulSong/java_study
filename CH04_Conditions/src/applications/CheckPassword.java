package applications;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// �Է��� �н����尡 ������ �н������ ������ ��
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "Arsenal";
		
		System.out.print("��й�ȣ �Է� : ");
		String password = scanner.nextLine(); //���� ��ȣ�� ������ ��� .nextInt
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���� ����.");	
		} else {
			System.out.println("���� �Ұ�.");
		}
	
	}

}
