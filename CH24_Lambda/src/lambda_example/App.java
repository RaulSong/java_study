package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// 람다식 예제로 리스트를 사용해보기
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		//리스트의 forEach 메소드의 매개변수는 Consumer인터페이스 객체이다
		//인터페이스로는 객체를 만들 수 없기 때문에 익명 클래스를 만들고 추상메소드를 완성함
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// Consumer 인터페이스의 추상 메소드 (구현을 해야함)
				System.out.println(t);
				System.out.println(" ");
			}
		});
		//람다식으로 간략히
		list.forEach(s->System.out.println(s));
	}

}
