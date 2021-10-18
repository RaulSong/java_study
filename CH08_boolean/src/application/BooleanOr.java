package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || : OR 논리 연산자
		boolean isRaining = false; //비가 오는가?
		boolean mightRain = true; //비가 올 수도 있는가?
		boolean takeUmbrella = true; //우산을 가져가는가?
		
		takeUmbrella = isRaining || mightRain; //비가 오거나 올 수도 있거나, 하나라도 참이면 참
		
		System.out.println(takeUmbrella);
	}
}
