package Custom_exception;


import Custom_exception.exception.TempTooHighException;
import Custom_exception.exception.TempTooLowException;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature); //온도가 정상일 경우 출력
	}

	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException{
		if(temperature < 0) {
			throw new TempTooLowException("온도가 너무 낮습니다.");
		}
		else if(temperature > 35) {
			throw new TempTooHighException("온도가 너무 높습니다.");
		}
		
	}
	
}
