package throwing_exception;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			//�µ����� ���������� ���� ����ó�� ��. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���� �� ó��)
			throw new Exception("�µ��� �������Դϴ�.");
		}
		System.out.println("�µ� ���� : " + temperature); //�µ��� ������ ��� ���
	}
}
