package throwing_exception2;

public class App {

	public static void main(String[] args){
		// ����ó���� �ѱ�
		Thermostat stat = new Thermostat();
		//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ���� �� ó���ؾ� ��
		//try-catch�� �ٷ� ó��, throw�� �ѱ�
		try {
			stat.setTemperature(40);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
