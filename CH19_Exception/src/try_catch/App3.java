package try_catch;

import java.util.Scanner;

public class App3 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();
	}
	
	private static int getNumber() {
		
		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.println("숫자를 입력 : ");
			String line = scanner.nextLine();
		

			try { //에러가 발생할 수 있는 코드를 try문 안에 넣음
				number = Integer.parseInt(line);
				isNumber = true;
			} catch (Exception e) { //try에서 에러 발생시 catch 문에서 처리
				System.out.println("숫자 입력이 아닙니다.");
			}
		}while(!isNumber);
		return number;
	}

}
