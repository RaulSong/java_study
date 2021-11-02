package linked_Hashset;

import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		// linked hashset : 중복 되지 않고 입력된 순서대로 출력
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지")); //있으면 true 없으면 false
		
		for(String f : fruits) {
			System.out.println(f);
		}
	}

}
