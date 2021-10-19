package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); //JFrame에 타이틀을 생성하도록
		
		setLayout(new BorderLayout());
		add(new MainPanel(), BorderLayout.CENTER);
		add(new Toolbar(), BorderLayout.NORTH);
		
		setSize(600, 400); //창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //창을 닫을 때 프로그램 종료
		setVisible(true);  //보이게 하기
	}
}
