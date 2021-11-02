package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) throws IOException {
		// å ������ �ҷ��ͼ� �ܾ�� ���� ���
		File wordsGrim = new File("grim.txt"); //���� ���� üũ
		System.out.println(wordsGrim.exists()); 
		
		TreeSet<String> grimlist = loadWords(wordsGrim);
		
		System.out.println(grimlist.size()); // �ܾ� ���� ���
		
		displayWords(grimlist);
	}
	private static void displayWords(TreeSet<String> list) {
		//Ʈ������ �Է¹޾� �� �ȿ� �ܾ���� ����Ѵ�
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
		// ������ �Է��ϸ� ������ �о �ܾ���� Ʈ�������� ����
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			while((line = reader.readLine()) != null) { //������ ���پ� �дٰ� ���������� �а��� ����
				String[] words = line.split("[^a-zA-z]+");
				
				for(String w : words) {
					if(w.length()<2) continue;
					wordSet.add(w.toLowerCase()); //�ܾ���� �ҹ��ڷ� ����Ʈ�� �߰�
				}
			}
		}
		return wordSet;
	}
}
