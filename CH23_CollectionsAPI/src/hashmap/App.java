package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 순서(인덱스)가 없고 키 값으로 인덱스 대체
		HashMap<Integer, String> people = new HashMap<>();
		//맵은 입력시 값이 2개(key,value)이기 때문에 add가 아니라 put
		people.put(0, "라카제트");
		people.put(1, "오바메양");
		people.put(3, "은케티아");
		people.put(4, "발로군");
		people.put(4, "페페");
		people.put(10, "사카");
		
		people.forEach((k,v)-> {
			System.out.println(k+ ": " + v);
		});
		//키 값에 해당하는 값을 가져오기
		System.out.println(people.get(4));
		System.out.println(people.get(10));
		
	}

	
}
