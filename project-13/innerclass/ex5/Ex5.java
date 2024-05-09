package innerclass.ex5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 {

	public static void main(String[] args) {
		
		// 자바 swing 이라고 UI구현하는 기능이 있음 요즘 잘 사용안하는 추세 맛보기로 사용
		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500,300,500,300);
		frame.setVisible(true);
		Button button = new Button("Click");
		frame.add(button);

		// 2. 버튼 이벤트 등록하기
//		button.addActionListener(new EventHandler());
		
		// 3. 익명함수 써보기
		button.addActionListener( new ActionListener() { // 부모의 이름을 카피
			int i = 0;

			@Override // 추상 메소드를 오버라이드
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!");
				System.out.println(i +"번째");
				i++;
			} 
			
		});
	}

}

// 클래스로 인터페이스 구현하기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");
	}
	
}