package try_catch;

import java.util.Scanner;

public class App3 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = getNumber();
		System.out.println("�Է��� ���ڴ� : " + number);
		scanner.close();
	}
	
	private static int getNumber() {
		
		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.println("���ڸ� �Է� : ");
			String line = scanner.nextLine();
		

			try { //������ �߻��� �� �ִ� �ڵ带 try�� �ȿ� ����
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (Exception e) { //try���� ���� �߻��� catch ������ ó��
				System.out.println("���� �Է��� �ƴմϴ�.");
			}
		}while(!isNumber);
		return number;
	}

}
