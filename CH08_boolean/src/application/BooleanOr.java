package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || : OR �� ������
		boolean isRaining = false; //�� ���°�?
		boolean mightRain = true; //�� �� ���� �ִ°�?
		boolean takeUmbrella = true; //����� �������°�?
		
		takeUmbrella = isRaining || mightRain; //�� ���ų� �� ���� �ְų�, �ϳ��� ���̸� ��
		
		System.out.println(takeUmbrella);
	}
}
