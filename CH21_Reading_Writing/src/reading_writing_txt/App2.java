package reading_writing_txt;

import java.io.File;

public class App2 {
	public static void main(String[] args) {
		//������ �����θ� ���ڿ��� ǥ��(\\�� ǥ�õ�)
		String fileLocation = "E:\\JAVA\\java-study\\CH21_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists()); //������ ������ true ������ false�� ����
	}

}