package throwing_exception2;

public class Thermostat {
	
	public void setTemperature(double temperature) throws Exception {
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature); //�µ��� ������ ��� ���
	}

	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			//�µ����� ���������� ���� ����ó�� ��. throw�� �ϴ� ���ܸ� ���߿� ó��(�� �޼ҵ带 ȣ���� �� ó��)
			throw new Exception("�µ��� �������Դϴ�.");
		}
		
	}
	
}
