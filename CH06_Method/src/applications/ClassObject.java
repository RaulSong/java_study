package applications;

class Person{
	String name;
}

public class ClassObject {

	public static void main(String[] args) {
		// 클래스란 설계도로 실제 사용가능한 실체를 생성(메모리에 생성)
		Person p1=new Person(); //실제 객체를 생성
		p1.name="Saka";
		
		Person p2=new Person();	//실제 객체를 생성
		p2.name="Partey";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		
	}

}
