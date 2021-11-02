package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws IOException {
		// 책 파일을 불러와서 단어로 정렬 출력
		File wordsGrim = new File("grim.txt"); //파일 존재 체크
		System.out.println(wordsGrim.exists()); 
		
		TreeSet<String> grimlist = loadWords(wordsGrim);
		
		System.out.println(grimlist.size()); // 단어 갯수 출력
		
		displayWords(grimlist);
	}
	private static void displayWords(TreeSet<String> list) {
		//트리셋을 입력받아 그 안에 단어들을 출력한다
		int count = 0;
		for(String w : list) {
			if(w.length()>=6) {
			System.out.printf("%-17s \t", w);
			count++;
			if(count==6) {
				System.out.println();
				count = 0;
			}
			
			}
		}
	}
	private static TreeSet<String> loadWords(File file) throws IOException {
		// 파일을 입력하면 파일을 읽어서 단어들을 트리셋으로 리턴
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			while((line = reader.readLine()) != null) { //파일을 한줄씩 읽다가 마지막글을 읽고나면 종료
				String[] words = line.split("[^a-zA-z]+");
				
				for(String w : words) {
					if(w.length()<2) continue;
					wordSet.add(w.toLowerCase()); //단어들을 소문자로 리스트에 추가
				}
			}
		}
		return wordSet;
	}
}
