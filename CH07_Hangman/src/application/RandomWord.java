package application;

import java.util.Random;

public class RandomWord {
	private String books = "celebration faithful conglomerate craftsman portrait grateful reliance distinct prediction adoption resignation transition broccoli emphasis grandfather orientation disgrace character exaggerate emergency";
	private String[] words = books.split(" ");
	private String selectWord; //������ �ܾ�
	private Random rand = new Random();
	public RandomWord() {	
		selectWord = words[rand.nextInt(words.length)]; //�������� �ܾ ����
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
