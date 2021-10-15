package windowProgramming;

public class Window {
	//클래스 변수
	private int width;
	private int height;
	private boolean isVisible; //보이는가?
	private int top;	//좌표 위쪽에서 거리
	private int left;	//좌표 왼쪽에서 거리
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getwidth() {
		return width;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	

}
