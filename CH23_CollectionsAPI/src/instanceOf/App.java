package instanceOf;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature { 
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {
		// 객체의 타입을 판별함
		Creature c1 = new Creature();
		Object c2 = c1; //Object는 최상위 클래스 타입으로 어느 클래스 타입에도 선언 가능
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c2 instanceof Object);
		System.out.println(c2 instanceof Serializable);
		System.out.println(c2 instanceof Creature);
		System.out.println(c2 instanceof Cat);
	
	}

}
