package applications;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// ������ ������ �ڵ����{}���� ����
		{
			int value = 0;
			System.out.println(value);
		}
		//System.out.println(value); ���� ���Ͽ��� ������ ���� ���� ��� �Ұ�
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
		//System.out.println(i); : error
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("�����Ϸ��� 'q' �Է�");
			input = scanner.nextLine();
		} while (!input.equals("q"));

		scanner.close();
	}

}