package applications;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// IF��
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����
		
		System.out.println("����� ������?");
		int apples = scanner.nextInt();
		
		System.out.println("�ٳ����� ������?");
		int bananas = scanner.nextInt();		
		
		scanner.close(); //��ĳ�� ����� �ݱ�, �ݾƾ� ���ǥ�� �����
		
		if(apples > bananas) { //if�� �ȿ� �ִ� ������ ���̸� ���
			System.out.println("����� �ٳ������� ����");
		}
		else { //if���� ������ false�϶� ���
			System.out.println("�ٳ����� ������� ����");
		}
		
	}

}
