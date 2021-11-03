package lambda_example;

//FunctionalInterface : 추상메소드가 단 하나일 때
@FunctionalInterface
public interface Test {
	void run();	//추상 메소드
	//void run2(); 에러 발생
}
