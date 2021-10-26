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
			//온도가 낮을 경우 처리 코드
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			//온도가 높을 경우 처리 코드
			System.out.println(e.getMessage());
		}
	
	}
}

