package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {
		// 1. 화면 만들기~
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500,300,500,300);
		
		TextArea textArea = new TextArea("텍스트 상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);
		

		// 1.
		textArea.addFocusListener(new MyFocus());
		
		// 2.
//		textArea.addFocusListener( new FocusListener() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				System.out.println("텍스트에 포커스가 되었습니다. . .");
//			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				System.out.println("텍스트에 포커스가 벗어났습니다. . .");
//			}
//		});
	}

}

class MyFocus implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("텍스트에 포커스가 되었습니다. . .");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("텍스트에 포커스가 벗어났습니다. . .");
	}
	
}
