package Custom_exception.exception;

public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;

	public TempOutOfRangeException(String message) {
		//������ ���� �޼����� ���� ���� Ŭ������ ó��
		super(message); //���� Ŭ�������� �޼��������� ���ܸ� ����
	}
}
