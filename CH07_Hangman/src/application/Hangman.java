package application;

import java.util.Random;

public class Hangman {
	private boolean running = false;
	RandomWord word = new RandomWord();
	public void run() {
		do {
			displayWord();			//화면에 단어 표시
			getUserInput();			//입력
			checkUserInput();		//맞는지 체크 다맞으면 runnuing = false
		} while (running);	
	}
	private void checkUserInput() {
		System.out.println("체크");	
	}
	private void getUserInput() {
		System.out.println("단어 맞추기");	
	}
	private void displayWord() {
		// 램덤 단어 출력			
		System.out.println(word.toString());
	}
}
