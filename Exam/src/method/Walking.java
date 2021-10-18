package method;

public class Walking {

	public static void main(String[] args) {
		//1.칼로리 계산을 위해 메소드 호출
		calculateCalory(5000);
		//3.결과 출력
		double result = calculateCalory(5000);
		System.out.println("소모 칼로리 : " + result + "kcal");

	}
	//2.칼로리 계싼 메소드 정의
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}

}
