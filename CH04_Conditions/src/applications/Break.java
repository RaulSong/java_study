package applications;

public class Break {

	public static void main(String[] args) {
		// Break : 반복문 안에서 사용시 반복문을 빠져 나옴
		int count = 0;
		
		while(true) {
			System.out.println("아스날 우승" +count);
			
			if(count == 5) break;
			
			
			System.out.println("아스날 무패 우승");
			count++; 
			
		}
		
		System.out.println("프로그램 종료.");
	}
}