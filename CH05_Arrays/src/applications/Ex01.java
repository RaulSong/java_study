package applications;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		final int NUM=3; //�迭�� ũ��
		
		int[] numbers=new int[NUM];
		
		for(int i=0; i<NUM; i++) {
			System.out.print("���ڸ� �Է� : ");
			numbers[i]=scanner.nextInt();
		}
		
		scanner.close();
		
		int total=0; //������ ���� ����� ����
		for(int i=0; i<NUM; i++) {
			System.out.println(numbers[i]);
			total=total+numbers[i]; //�迭�� ������ �ϳ��ϳ��� ���� ����
		}
		
		System.out.println("�հ� : "+total);
		
	}

}