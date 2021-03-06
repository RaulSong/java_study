package multiInheritance;

public class Person implements Speaker, Greeter {
	//인터페이스는 다중(여러 개)구현 가능, 상속은 하나만 가능
	@Override
	public void greet() {
		System.out.println("환영합니다.");		
	}

	@Override
	public void speak() {
		System.out.println("나는 Person입니다.");		
	}
	
}
