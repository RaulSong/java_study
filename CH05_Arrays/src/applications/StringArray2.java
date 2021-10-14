package applications;

public class StringArray2 {

	public static void main(String[] args) {
		// String은 참조 자료형, 참조 변수는 주소값을 갖는다
		
		String text=null; //null은 참조 변수에 주소값이 없음
		
		//text=new String("Hello!");
		text="Hello!";
		System.out.println(text);
		
		String[] texts=null;
		System.out.println(texts);
		
		texts=new String[3]; //3개의 문자열 배열공간 생성
		System.out.println(texts); //배열의 주소값을 출력
		
		texts[0]=new String("Hi!");
		texts[1]="안녕?";
		texts[2]="안녕하세요~";
		
		for(String word:texts) {
			System.out.println(word);
		}
				
	}

}
