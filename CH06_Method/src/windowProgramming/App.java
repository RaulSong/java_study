package windowProgramming;

public class App {

	public static void main(String[] args) {
		Window win = new Window();
		win.setWidth(400);
		win.setIsVisible(true);
		win.setHeight(100);

		
		
		
		System.out.println("â�� ���α��� : " + win.getwidth());
		System.out.println("���̴°�? : "  + win.getIsVisible());
		System.out.println("â�� ���α��� : " + win.getheight());
	}

}
