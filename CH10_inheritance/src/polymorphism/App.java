package polymorphism;

public class App {

	public static void main(String[] args) {
		//객체를 상속받은 Cat타입으로 선언
//		Cat cat1 = new HouseCat();
//		cat1.vocal();
//		cat1.hunt();
//		
//		Cat cat2 = new RoadCat();
//		cat2.vocal();
//		cat2.hunt();
//		
//		Cat cat3 = new Tiger();
//		cat3.vocal();
//		cat3.hunt();

		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		//cats[0] = new HouseCat()
		//cats[1] = new RoadCat()
		//cats[2] = new Tiger()
//		cats[0].vocal();
//		cats[0].hunt();
//		
//		cats[1].vocal();
//		cats[1].hunt();
//		
//		cats[2].vocal();
//		cats[2].hunt();
		
		//반복문
		for(int i=0; i<cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		//for each
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		//**형 변환 casting
		//기본타입
		//int a = 1.2345;
		int b = (int)1.2345;
		System.out.println(b);
		
		//**참조 타입 : 기본을 제외한 클래스 타입 등
		Cat cat1 = new HouseCat(); //업캐스팅
		
		HouseCat cat2 = (HouseCat)cat1; //다운캐스팅
		
	}

}
