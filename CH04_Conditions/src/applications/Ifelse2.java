package applications;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		// IF문
		Scanner scanner = new Scanner(System.in); //스캐너 생성
		
		System.out.println("사과의 갯수는?");
		int apples = scanner.nextInt();
		
		System.out.println("바나나의 갯수는?");
		int bananas = scanner.nextInt();		
		
		scanner.close(); //스캐너 사용후 닫기, 닫아야 경고표시 사라짐
		
		if(apples > bananas) { //if문 안에 있는 조건이 참이면 출력
			System.out.println("사과가 바나나보다 많음");
		}
		else if(apples < bananas){ //if문의 조건이 false일때 출력
			System.out.println("바나나가 사과보다 많음");
		}
		else { //같을 경우
			System.out.println("갯수가 같음");
		}
		
	}

}
