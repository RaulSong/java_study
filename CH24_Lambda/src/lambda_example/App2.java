package lambda_example;

interface Runner {
	void execue();
}

public class App2 {

	public static void main(String[] args) {
		// ���� �Լ��� �������̽��� ����� ���ٽ� ���
		//1. �Լ��� �������̽�(�޼ҵ尡 1��)�϶� ��� ����
		//2. �߻�޼ҵ��� ���ϰ��� �Ű������� Ȯ���ϰ� ����
		Runner run = ()->System.out.println("���");
		run.execue();	
	}
}
