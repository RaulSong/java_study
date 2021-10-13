package applications;

public class ControlCharacter {

	public static void main(String[] args) {
		// 제어문자 (\n:줄바꿈, \t:탭)
		System.out.println("======================");
		System.out.println("\t탭\t탭만큼 띄움.");
		System.out.println("======================	");
		System.out.println("자바를\n배우고\n있습니다.");
		//프린트라인은 줄바꿈을 하는데 그냥 프린트는 줄바꿈 하지 않음.
		System.out.print("프린트는");
		System.out.print("줄을 띄우지 않습니다.");
	}

}
