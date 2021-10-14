package applications;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드를 입력받아 do while 문으로 맞는지 검사
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "Arsenal";
		
		String password = "";
		do {
			System.out.print("비밀번호 입력 : ");
			password = scanner.nextLine(); //받을 암호가 숫자일 경우 .nextInt
			
		}while (!password.equals(USER_PASSWORD)); // '!'는 반대
		
		 scanner.close();
		 System.out.println("접속 승인.");
	}

}
