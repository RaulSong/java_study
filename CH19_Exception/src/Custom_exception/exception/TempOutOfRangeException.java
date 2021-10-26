package Custom_exception.exception;

public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;

	public TempOutOfRangeException(String message) {
		//생성자 예외 메세지를 상위 예외 클래스에 처리
		super(message); //예외 클래스에서 메세지명으로 예외를 생성
	}
}
