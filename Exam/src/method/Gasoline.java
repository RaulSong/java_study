package method;

public class Gasoline {

	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calEfficiency(distance % gasoline);
		
		
		System.out.printf("���� : %.2f km/L", efficiency);
	}
	public static double calEfficiency(double fuels, double distance) {
		//�ش� �޼ҵ带 �����ϼ���
		return 0;
	}
}
