package applications;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴");
		System.out.println("====\n");
		System.out.println("1. 프린트 '아스날 우승'");
		System.out.println("2. 프린트 '아스날 무패우승'");
		System.out.println("3. 프린트 '프로그램 종료'");	
		System.out.println("옵션을 선택 > ");
		
		int option = scanner.nextInt();
		
		scanner.close();
		
		/*
		//동등 비교 : ==(같음), !=(같지 않음)
		if(option==1) {
			System.out.println("아스날 우승");
		}
		else if(option ==2) {
			System.out.println("아스날 무패우승");
		}
		else if(option ==3) {
			System.out.println("프로그램 종료");
		}
		else if(option ==10000) {
			System.out.println("이스터에그를 발견했습니다.");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		}*/
		
		//스위치문으로 똑같이 출력
		switch(option) {
		case 1:
			System.out.println("아스날 우승");
			break;
		case 2:
			System.out.println("아스날 무패우승");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다.");
			break;
		default :
			System.out.println("잘못된 옵션입니다.");		
		}
	}

}
