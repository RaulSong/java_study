package enum_method;

public class App {

	public static void main(String[] args) {
		//values()메소드 해당 enum의 모든 상수를 저장한 배열을 맅ㄴ
		Fruit[] fruits = Fruit.values();
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		//ordinal 메소드는 상수의 순서(인덱스 0부터 시작)를 시작
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		//valueOf("값")메소드
		Fruit f1 = Fruit.valueOf("ORANGE"); //문자열 ORANGE와 같은 값을 가진 enum 상수를 찾음
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
	}
}
