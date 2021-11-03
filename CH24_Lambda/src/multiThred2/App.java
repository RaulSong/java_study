package multiThred2;

public class App {
	private int value = 0;
	private synchronized void increment() {
		value++;
	}
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i=0; i<10000; i++) {
				increment();
			}
		};
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		//t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start();
		t2.start();
		t3.start();
		//System.out.println("Value : " + value);
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Value : " + value);
	}
	public static void main(String[] args) throws InterruptedException {
		//앱 객체 생성하여 메소드 run 실행
		new App().run();
	}
}