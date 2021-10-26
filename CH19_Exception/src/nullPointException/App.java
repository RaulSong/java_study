package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null포인터, 0으로 나눴을때 -> 런타임 예외 발생
		// 1. 0으로 나눴을 때
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		// 2. 객체의 주소값이 null일 때(특히 많이 발생!!!)
		Scanner scanner = null;	//new Scanner(System.in);
		
		try {
			scanner.nextLine();	
			scanner.close();
		} catch (NullPointerException e) {
			System.out.println("Scanner의 값이 null입니다.");
		}
	}
}
