package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null������, 0���� �������� -> ��Ÿ�� ���� �߻�
		// 1. 0���� ������ ��
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		// 2. ��ü�� �ּҰ��� null�� ��(Ư�� ���� �߻�!!!)
		Scanner scanner = null;	//new Scanner(System.in);
		
		try {
			scanner.nextLine();	
			scanner.close();
		} catch (NullPointerException e) {
			System.out.println("Scanner�� ���� null�Դϴ�.");
		}
	}
}
