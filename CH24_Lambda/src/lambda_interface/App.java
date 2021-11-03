package lambda_interface;

import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		//Predicate는 generic T 타입을 검사해서 boolean 리턴한다.
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// 추상메소드 테스트 리턴값(참/거짓), 문자열 매개변수1
				return t.length()<4;	//4보다 작으면 참
			}
		};
		System.out.println(p1.test("saka"));
		System.out.println(p1.test("EPL"));
		
		// 람다식
		Predicate<String> p2 = t -> t.length()<4;
		System.out.println(p1.test("saka"));
		System.out.println(p1.test("EPL"));
	}
}
