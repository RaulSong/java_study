package application;

import java.util.Random;

public class Hangman {
	private boolean running = false;
	RandomWord word = new RandomWord();
	public void run() {
		do {
			displayWord();			//ȭ�鿡 �ܾ� ǥ��
			getUserInput();			//�Է�
			checkUserInput();		//�´��� üũ �ٸ����� runnuing = false
		} while (running);	
	}
	private void checkUserInput() {
		System.out.println("üũ");	
	}
	private void getUserInput() {
		System.out.println("�ܾ� ���߱�");	
	}
	private void displayWord() {
		// ���� �ܾ� ���			
		System.out.println(word.toString());
	}
}
