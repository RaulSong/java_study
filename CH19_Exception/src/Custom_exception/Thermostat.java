package Custom_exception;


import Custom_exception.exception.TempTooHighException;
import Custom_exception.exception.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		setMachineTemperature(temperature);
		
		System.out.println("�µ� ���� : " + temperature); //�µ��� ������ ��� ���
	}

	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException{
		if(temperature < 0) {
			throw new TempTooLowException("�µ��� �ʹ� �����ϴ�.");
		}
		else if(temperature > 35) {
			throw new TempTooHighException("�µ��� �ʹ� �����ϴ�.");
		}
		
	}
	
}
