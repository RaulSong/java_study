package applications;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴�");
		System.out.println("====\n");
		System.out.println("1. ����Ʈ '�ƽ��� ���'");
		System.out.println("2. ����Ʈ '�ƽ��� ���п��'");
		System.out.println("3. ����Ʈ '���α׷� ����'");	
		System.out.println("�ɼ��� ���� > ");
		
		int option = scanner.nextInt();
		
		scanner.close();
		
		/*
		//���� �� : ==(����), !=(���� ����)
		if(option==1) {
			System.out.println("�ƽ��� ���");
		}
		else if(option ==2) {
			System.out.println("�ƽ��� ���п��");
		}
		else if(option ==3) {
			System.out.println("���α׷� ����");
		}
		else if(option ==10000) {
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
		}
		else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}*/
		
		//����ġ������ �Ȱ��� ���
		switch(option) {
		case 1:
			System.out.println("�ƽ��� ���");
			break;
		case 2:
			System.out.println("�ƽ��� ���п��");
			break;
		case 3:
			System.out.println("���α׷� ����");
			break;
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
		default :
			System.out.println("�߸��� �ɼ��Դϴ�.");		
		}
	}

}
