package 그래픽;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class 카운트다운 extends JFrame {
	//객체생성하지 않아도 언제든지 static메서드에서 접근해서
	//사용하려면 멤버변수도 반드시 static! 되어야 한다!!
	//static이 아닌 일반 변수는 반드시 객체생성해야 접근!!
	JLabel count, image, day;
	
	public 카운트다운() { //생성자 메서드, inner 클래스
		setSize(900, 300);
		getContentPane().setBackground(Color.GREEN);

		count = new JLabel("count : 500");
		count.setFont(new Font("굴림", Font.BOLD, 26));
		getContentPane().add(count, BorderLayout.WEST);
		
		day = new JLabel("day");
		day.setFont(new Font("굴림", Font.BOLD, 32));
		getContentPane().add(day, BorderLayout.SOUTH);

		
		image = new JLabel();
		image.setFont(new Font("굴림", Font.BOLD, 40));
		getContentPane().add(image, BorderLayout.CENTER);
		//ImageIcon icon = new ImageIcon("다운로드1.jfif");
		//image.setIcon(icon);
		
		//count thread
		//카운트2 c = new 카운트2();
		//날짜2 d = new 날짜2();
		//이미지2 e = new 이미지2();
		//c.start();
		//d.start();
		//e.start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		카운트다운 t = new 카운트다운();
		카운트 c = new 카운트(t.count);
		날짜 d = new 날짜(t.day);
		이미지 e = new 이미지(t.image);
		c.start();
		d.start();
		e.start();
	} //메인함수
	
	//변수를 공유해야하는 2클래스가 있다면, 클래스안에 클래스를 낄 수 있다.
	//inner class, 내부클래스
	public class 이미지2 extends Thread {
		@Override
		public void run() {
			String[] list = {"다운로드1.jfif", "다운로드2.jfif", "다운로드3.jfif", "다운로드4.jfif", "다운로드5.jfif"};
			int i = 1;
			int pause = 0;
			while (i < list.length) {
				ImageIcon icon = new ImageIcon("다운로드" + i + ".jfif");
				image.setIcon(icon);
				try {
					//초를 설정할 때는 밀리초, 1/1000설정.
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				i++;
				if (i == list.length) {
					pause++;
					i = 1;
					if(pause == 10) {
						break;
					}
				}
			}
		}
	}

	public class 카운트2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					//인터럽트(방해, 중단) : esc, ctrl+c, power-off
				}
			}
		}
	}
	
	public class 날짜2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				day.setText("날짜 : " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
