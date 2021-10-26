package gui;

import javax.swing.*;
import model.World;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private final static int CELLSIZE = 100;
	private final static Color backgroundColor = Color.BLACK;
	private final static Color gridColor = Color.GRAY;
	private int topBottomMargin;
	private int leftRightMargin;
	private World world;
	public GamePanel() {
		//게임 패널을 생성시 이벤트중(마우스 이벤트 추가)
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getY() < topBottomMargin || e.getX() < leftRightMargin) {
					return;
				}
				int row = (e.getY() - topBottomMargin) / CELLSIZE;
				int col = (e.getX() - leftRightMargin) / CELLSIZE;
				if(row >= world.getRows() || col >= world.getColumns()) {
					return;
				}
				boolean status = world.getCell(row, col);
				world.setCell(row,col,!status);
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) { //2D 그래픽 구현
		Graphics2D g2 = (Graphics2D)g;
		int width = getWidth();
		int height = getHeight();
		leftRightMargin = ((width%CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height%CELLSIZE) + CELLSIZE) / 2;
		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int cols = (width - 2 * leftRightMargin) / CELLSIZE;
//		System.out.println(rows);
//		System.out.println(cols);
		if(world == null) {
			world = new World(rows, cols);
		}
		
		g2.setColor(backgroundColor);
		g2.fillRect(0,0,width,height); //사각형의 좌표에 색을 칠함
		
		drawGrid(g2,width,height); //줄을 긋는 메소드
		
		for(int col=0; col<cols; col++) {
			for(int row=0; row<rows; row++) {
				boolean status = world.getCell(row, col);
				fillCell(g2,row,col,status);
			}
		}
	}
	private void fillCell(Graphics2D g2, int row, int col, boolean status) {
		Color color = status ? Color.GREEN : backgroundColor;
		g2.setColor(color);
		int x = leftRightMargin + (col*CELLSIZE);
		int y = topBottomMargin + (row*CELLSIZE);
		g2.fillRect(x+1,y+1,CELLSIZE-2,CELLSIZE-2);
	}
	private void drawGrid(Graphics2D g2, int width, int height) {
		g2.setColor(gridColor);
		
		for(int x = leftRightMargin; x<=width - leftRightMargin; x+=CELLSIZE) {
			g2.drawLine(x, topBottomMargin,x,height - topBottomMargin);
		}
		for(int y = topBottomMargin; y<=width - topBottomMargin; y+=CELLSIZE) {
			g2.drawLine(leftRightMargin,y,width - leftRightMargin,y);	
		}
	}
	
}
