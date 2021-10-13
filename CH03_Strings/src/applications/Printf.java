package applications;

public class Printf {

	public static void main(String[] args) {
		// 출력포맷 printf("출력서식(%d, %f, %c, %s)", 출력할 값)
		int age = 25;
		String addr = "부산";
		
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살이고, %s에 살고 있습니다.\n", age, addr);

		double pi = 3.14592; 
		System.out.printf("파이의 값은 : %f", pi);
		System.out.printf("파이의 값은 : %.2f", pi);//소숫점 자리는 .n으로 표시
	}

}
