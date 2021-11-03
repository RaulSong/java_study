package multiThred;

public class App {
	public static void main(String[] args) throws InterruptedException {
		// 멀티쓰레드
		Runnable runnable = () -> {
			for (int i=0; i<100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		//t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		

		System.out.println("Hello");
	}

}
