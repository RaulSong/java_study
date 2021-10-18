package application;

import java.util.Random;

public class RandomWord {
	private String books = "celebration faithful conglomerate craftsman portrait grateful reliance distinct prediction adoption resignation transition broccoli emphasis grandfather orientation disgrace character exaggerate emergency";
	private String[] words = books.split(" ");
	private String selectWord; //선택한 단어
	private Random rand = new Random();
	private char[] characters;
	public RandomWord() {	
		selectWord = words[rand.nextInt(words.length)]; //랜덤으로 단어를 선택
		characters = new char[selectWord.length()]; //문자 배열 공간 생성
	}
	public String toString() {
		//characters[3] = 'X';
		StringBuilder sb = new StringBuilder();
		for(char c: characters) {
			sb.append(c=='\u0000'?'_' : c);
			sb.append(' ');
		}
		//System.out.println(selectWord);
		return sb.toString();	
	}
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
	public void addGuess(char c) {
		// 사용자가 입력한 한 문자를 선택된 단어에서 같은게 있는지 확인
		// 있으면 characters의 인덱스 위치에 입력.
		for(int i=0; i<selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}	
	}
	public boolean isCompleted() {
		for(char c : characters) {
			if(c=='\u0000') {
				return false;
			}
		}
		return true;
	}
}


