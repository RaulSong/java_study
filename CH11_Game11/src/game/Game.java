package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;

public class Game {
	
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	public void run() {
		System.out.println("삼세판 가위바위보를 시작합니다...");
		
		int wins = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 게임을 시작합니다...");
		
		
			// 유저의 선택
			System.out.println("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
				
			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			
			
			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("상대의 선택은 : " + ob2.getName());
			
			int score = ob1.compare(ob2);
			wins = wins + score;
		}
		  
		if(wins > 0) {
			System.out.println("당신의 승리!");
		} else if(wins < 0) {
			System.out.println("당신의 패배!");
		} else {
			System.out.println("비겼습니다!");
		}
		
		
	}
}
