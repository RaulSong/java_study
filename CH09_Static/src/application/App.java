package application;

public class App {

	public static void main(String[] args) {
		// 고양이 클래스 불러오기
		Cat cat1 = new Cat("라울");
		Cat cat2 = new Cat("러시");
		
		System.out.println(cat1);
		System.out.println(cat2.toString());
		//스태틱 변수는 객체와 상관없이 '클래스명.변수명'로 사용한다. 객체 생성 불요
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		System.out.println(cat1.getCount());
		System.out.println(cat2.getCount());
		
		Cat cat3 = new Cat("캐시");
		System.out.println(cat3.getCount());
	}

}
