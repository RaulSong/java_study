package application;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// �׽�Ʈ��
		RandomWord word = new RandomWord();
		
		//System.out.println(word.toString());
		
		Random random = new Random();
		
		String[] words = {"���","�����","���̾�","�ƽ���","��Ʈ��"};
		
		
		
		for(int i=0; i<100; i++) {
			int n = random.nextInt(words.length); //�迭�� ũ�⸸ŭ �������� ����
			System.out.println(words[n]);
		}

	}

}
