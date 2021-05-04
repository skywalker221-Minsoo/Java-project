package 조건문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class 그래픽입문 {

	public static void main(String[] args) {
		JFrame f = new JFrame();	// 큰 틀 생성
		JButton b1 = new JButton();	// 찍어내는 부속품 정도
//		JButton b2 = new JButton();
//		JButton b3 = new JButton();
		f.setSize(500, 500); // 가로x세로 세팅
		
		JButton b2 = new JButton("\uBD81\uCABD");
		f.getContentPane().add(b2, BorderLayout.NORTH);
		
		JButton b3 = new JButton("\uC911\uC559");
		b3.setFont(new Font("굴림", Font.PLAIN, 18));
		b3.setForeground(Color.YELLOW);
		b3.setBackground(Color.RED);
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("\uC67C\uCABD");
		b4.setForeground(Color.GREEN);
		b4.setFont(new Font("굴림", Font.PLAIN, 12));
		f.getContentPane().add(b4, BorderLayout.WEST);
		
		JButton b5 = new JButton("\uC624\uB978\uCABD");
		f.getContentPane().add(b5, BorderLayout.EAST);
		
		JButton b6 = new JButton("\uC544\uB798\uCABD");
		f.getContentPane().add(b6, BorderLayout.SOUTH);
//		f.add(b1); // 버튼을 JFrame 위에 하나 설치
//		b1.setText("나를 눌러요"); // 버튼 안 글자 입력
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
