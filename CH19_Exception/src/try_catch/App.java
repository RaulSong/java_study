package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// try catch���� ����� ����ó��
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է� : ");
		String line = scanner.nextLine();
		
		int number = 0;

		
		
		try { //������ �߻��� �� �ִ� �ڵ带 try�� �ȿ� ����
			number = Integer.parseInt(line);
			System.out.println("����� ������� �ʾƿ�.");
		} catch (Exception e) { //try���� ���� �߻��� catch ������ ó��
			System.out.println("���� �Է��� �ƴմϴ�.");
		}
		
		System.out.println("�Է��� ���ڴ� : " +number);
	}

}