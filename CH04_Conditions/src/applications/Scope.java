package applications;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// 변수의 범위는 코드블록{}으로 설정
		{
			int value = 0;
			System.out.println(value);
		}
		//System.out.println(value); 상위 블록에서 생성한 동일 변수 사용 불가
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
		//System.out.println(i); : error
		
		Scanner scanner = new Scanner(System.in);
		
		String input = "";
		do {
			System.out.println("종료하려면 'q' 입력");
			input = scanner.nextLine();
		} while (!input.equals("q"));

		scanner.close();
	}

}
