package arrayList;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// ��ĳ�� ����� ����Ʈ�� �Ǽ��� �Է��� ���
		Scanner scanner = new Scanner(System.in);
		
		List<Double> numbers = new ArrayList<>();
		
		double total = 0;
		
		
		while (true) {
			System.out.println("���� �Ǵ� 'q' �Է� > ");

			String input = scanner.nextLine();// ���� ������ �Է��� ���ڿ� ����

			input = input.trim();// ���� ������ �� �ڿ� ������ ����

			if (input.equalsIgnoreCase("q")) { // ��ҹ��� �����ϰ� ��
				break; // ���� �Էµ� ���ڿ��� "q"�� ������ �ݺ��� ����
			}

			try {
				double value = Double.parseDouble(input);
				numbers.add(value);
				total = total + value;
			} catch (NumberFormatException e) {
				// �Ǽ��� ��ȯ�� �� �߻��� ����
				System.out.println("���ڰ� �ƴմϴ�.");
				continue;
			}
		}
		scanner.close();

		System.out.println();
		
		if (numbers.size() > 0) {
			System.out.println("�Էµ� ���� : ");
			
			Collections.sort(numbers);
			
			for (Double number : numbers) {
				System.out.printf("%.2f\n", number);// �Ǽ��� �Ҽ��� ���ڸ����� ���
			}
			System.out.println();
			System.out.printf("��հ� : %.2f", total / numbers.size());
		} else {
			System.out.println("�Ǽ��� �Էµ��� �ʾҽ��ϴ�.");
		}
		
	}
}
