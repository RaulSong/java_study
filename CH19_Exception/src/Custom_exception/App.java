package Custom_exception;

import Custom_exception.exception.TempOutOfRangeException;
import Custom_exception.exception.TempTooHighException;
import Custom_exception.exception.TempTooLowException;

public class App {

	public static void main(String[] args){
		
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(-5);
		} catch (TempTooHighException e) {
			//�µ��� ���� ��� ó�� �ڵ�
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			//�µ��� ���� ��� ó�� �ڵ�
			System.out.println(e.getMessage());
		}
	
	}
}

