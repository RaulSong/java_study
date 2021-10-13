package applications;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Switch문
		System.out.print("계속 진행하겠습니까? (y/n):");
		String input = scanner.nextLine();
		scanner.close();
		
		switch(input) {
		case "y":
			System.out.println("진행합니다....");
			break;
		case "n":
			System.out.println("종료합니다...");
			break;
		default :
			System.out.println("잘못된 입력입니다!");
		}

	}

}
