package applications;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 입력한 패스워드가 지정된 패스워드와 같은지 비교
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "Arsenal";
		
		System.out.print("비밀번호 입력 : ");
		String password = scanner.nextLine(); //받을 암호가 숫자일 경우 .nextInt
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");	
		} else {
			System.out.println("접속 불가.");
		}
	
	}

}
