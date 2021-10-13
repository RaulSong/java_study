package applications;

public class Switch {

	public static void main(String[] args) {
		// Switch문
		int option = 9;
		
		switch(option) {
		case 0:
			System.out.println("옵션 0 선택");
			break;
		case 10:
			System.out.println("프로그램 종료...");
			break;
		default :
			System.out.println("잘못된 옵션번호");
		}

	}

}
