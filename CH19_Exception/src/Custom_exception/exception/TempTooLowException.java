package Custom_exception.exception;

public class TempTooLowException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;

	public TempTooLowException(String message) {
		//������ ���� �޼����� ���� ���� Ŭ������ ó��
		super(message); //���� Ŭ�������� �޼��������� ���ܸ� ����
	}
}
