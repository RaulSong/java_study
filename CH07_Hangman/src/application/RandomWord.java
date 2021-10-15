package application;

import java.util.Random;

public class RandomWord {
	private String books = "celebration faithful conglomerate craftsman portrait grateful reliance distinct prediction adoption resignation transition broccoli emphasis grandfather orientation disgrace character exaggerate emergency";
	private String[] words = books.split(" ");
	private String selectWord; //선택한 단어
	private Random rand = new Random();
	public RandomWord() {	
		selectWord = words[rand.nextInt(words.length)]; //랜덤으로 단어를 선택
	}
	public String toString() {
		return selectWord;
	}
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
