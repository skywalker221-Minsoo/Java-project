package 이너클래스복습;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InnerClassPractice extends JFrame {

	JLabel subject, graph, next;
	
	public InnerClassPractice() {
		
		setSize(800, 850);
		getContentPane().setBackground(Color.yellow);
		
		subject = new JLabel();
		subject.setBounds(140, 50, 784, 100);
		graph = new JLabel();
		graph.setBounds(30, 39, 814, 791);
		next = new JLabel();
		next.setBounds(0, 761, 784, 0);
		subject.setFont(new Font("굴림", Font.BOLD, 40));
		next.setFont(new Font("굴림", Font.BOLD, 26));
		getContentPane().setLayout(null);
		
		getContentPane().add(subject);
		getContentPane().add(graph);
		getContentPane().add(next);
		
		JButton quit = new JButton("\uC885\uB8CC");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //종료 버튼을 누르면 창이 닫힌다.
			}
		});
		quit.setBounds(282, 764, 209, 39);
		getContentPane().add(quit);
		
		
		graph2 g = new graph2();
		subject2 s = new subject2();
		
		g.start();
		s.start();
		
		setVisible(true);
	}

	public static void main(String[] args) { //Inner클래스를 사용할 것임.
		InnerClassPractice p = new InnerClassPractice();
	}


	public class subject2 extends Thread {
		
		@Override
		public void run() {
			String[] list2 = {"삼성전자", "HMM", "프레스티지바이오파마", "카카오", "SK하이닉스", "비덴트",
					"이트론", "국일제지", "셀트리온", "기아차"}; //이미지와 대응하여 제목을 출력할 것임.
			int pause = 0; // 한번 돌았을 때 멈추게 하기 위함.
			
			for (int i = 0; i < list2.length; i++) {
				subject.setText("종목 : " + list2[i]); //배열 안의 회사들을 차례로 출력한다.
				try {
					Thread.sleep(2000); //2초마다 전환
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == list2.length ) { //배열의 끝까지 돌게 되면 멈추게 한다.
					pause++;
					if (pause == 1) { //제목의 회전을 1번만 하고 멈추게 한다.
						interrupt(); //제목의 회전 멈춤.
					}
				}
			}
		}
	}
	
	
	public class graph2 extends Thread {
		
		@Override
		public void run() {
			
			String[] list = {"1.PNG", "2.PNG", "3.PNG", "4.PNG", "5.PNG", "6.PNG", 
					"7.PNG", "8.PNG", "9.PNG", "10.PNG", }; //가격, 주식그래프
			
			int i = 0;
			int pause = 0;
			
			while(i < list.length) { //제목과 마찬가지로 이미지파일 회전 
				i++; //이미지 파일을 차례대로 넘긴다.
				ImageIcon icon = new ImageIcon(i + ".PNG");
				graph.setIcon(icon); //이미지 파일을 JFrame에 위치시킨다.
				try {
					Thread.sleep(2000); //2초마다 회전
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if(i == list.length) { //이미지파일 회전이 다 되면
					i = 1; //다시 처음으로 돌아가게 한다. 그러나 지금은 1번만 돌고 멈추게 할 것.
					++pause; //전위연산을 통해 마지막 이미지까지 보인 후 멈추게 한다.
					if (pause == 1) {
						//interrupt();
						break; // while문을 빠져나와 그림의 회전을 멈춘다. 
							   // 이 때 interrupt가 안되는걸 보아 while문은 안먹히는듯...
					}
				}
			}
		}
	}
}