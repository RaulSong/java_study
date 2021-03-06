package staticMethod;

public class App {

	public static void main(String[] args) {
		// 스태틱 메소드 getCount 사용
		
		//String.format은 printf를 문자열로 리턴, 스태틱메소드 사용
		String catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("라울");
		Cat cat2 = new Cat("러시");
		Cat cat3 = new Cat("캐시");
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		catCount = String.format("고양이 숫자 : %d\n", Cat.getCount());
		System.out.println(catCount);
		
		int x = add(1,1);
		System.out.println(x);
	}
	private static int add(int a, int b) {
		return a+b;
	}
}
