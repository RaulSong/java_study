package applications;

public class Break {

	public static void main(String[] args) {
		// Break : �ݺ��� �ȿ��� ���� �ݺ����� ���� ����
		int count = 0;
		
		while(true) {
			System.out.println("�ƽ��� ���" +count);
			
			if(count == 5) break;
			
			
			System.out.println("�ƽ��� ���� ���");
			count++; 
			
		}
		
		System.out.println("���α׷� ����.");
	}
}