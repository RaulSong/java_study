package windowProgramming;

public class App {

	public static void main(String[] args) {
		Window win = new Window();
		win.setWidth(400);
		win.setIsVisible(true);
		win.setHeight(100);

		
		
		
		System.out.println("창의 가로길이 : " + win.getwidth());
		System.out.println("보이는가? : "  + win.getIsVisible());
		System.out.println("창의 세로길이 : " + win.getheight());
	}

}
