package lambda_interface;

import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		//Predicate�� generic T Ÿ���� �˻��ؼ� boolean �����Ѵ�.
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// �߻�޼ҵ� �׽�Ʈ ���ϰ�(��/����), ���ڿ� �Ű�����1
				return t.length()<4;	//4���� ������ ��
			}
		};
		System.out.println(p1.test("saka"));
		System.out.println(p1.test("EPL"));
		
		// ���ٽ�
		Predicate<String> p2 = t -> t.length()<4;
		System.out.println(p1.test("saka"));
		System.out.println(p1.test("EPL"));
	}
}
