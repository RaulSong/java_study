package timer_example;


import java.util.Timer;
import java.util.TimerTask;
//하나의 파일에 여러 개의 클래스를 만들 수 있다. 그런데 public class는 단 하나이고 파일의 이름과
class Task extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로~");		
	}	
}

public class App {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);	//할일:run(), 0초 뒤 실행, 반복 1초
	}

}
