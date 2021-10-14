package applications;

public class Final {

	public static void main(String[] args) {
		// 상수 키워드 final 변하지 않는 변수, 이름을 대문자로 만듦(관례)
		
		final int VALUE = 9;
		//VALUE = 10; 변하지않게 해뒀기 때문에 10으로 할 경우 에러
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "아스날 우승";
		//USER_PASSWORD = "아스날 무패우승";
		
		System.out.println(USER_PASSWORD);

	}

}
