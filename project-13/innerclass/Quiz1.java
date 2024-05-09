package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1. 화면 만들기~
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500,300,500,300);
		frame.setVisible(true);
		
		//
		
//		frame.addKeyListener( new MyKeyListener());
		
		frame.addKeyListener( new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				System.out.println(e.getKeyChar()+"키를 눌렀습니다");
			}
			
		});
	}

}
//
//class KeyAdapter implements KeyListener {
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("키보드를 눌렀습니다");
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//	}
//
//
//	
//}
//
//class MyKeyListener extends KeyAdapter{
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println("키보드를 눌렀습니당");
//	}
//}