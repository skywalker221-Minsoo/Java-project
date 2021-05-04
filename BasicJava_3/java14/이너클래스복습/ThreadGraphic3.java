package 이너클래스복습;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

public class ThreadGraphic3 extends JFrame { //JFrame 상속받아서 변수명을 바로 선언.
											 //변수형을 따로 선언할 필요가 없다.
											 //애초에 JFrame이 가지고 있던 변수를 다 가지고 쓸 수 있다.
											 //단, setsize, setvisible 다 하고 open with ->
											 //Design 에서 다 만들어 주고 변수 설정해야 함!!!
	
	JLabel count, image, day; //화면에 띄울 count, 이미지, 날짜
	
	public ThreadGraphic3() { //내부(inner)클래스를 사용함으로써 변수 등 코드의 복잡도를 줄인다.
		setSize(800, 300); //JFrame 크기 설정
		getContentPane().setBackground(Color.black); //이미지가 우주라 간지나게.
		
		count = new JLabel(); //JFrame 위에 쓰여질 라벨들.
		image = new JLabel();
		day = new JLabel();
		
		add(count, BorderLayout.WEST);//글자를 왼쪽에 배치.
		add(day, BorderLayout.SOUTH);//날짜는 아래쪽에 배치.
		add(image, BorderLayout.CENTER);//이미지는 센터에 보이도록.

		count.setForeground(Color.WHITE); // 배경이 검정색이라 글자가 잘보이도록 흰색으로한다.
		count.setFont(new Font("굴림", Font.BOLD, 40));
		
		day.setForeground(Color.WHITE);
		day.setFont(new Font("굴림", Font.BOLD, 32));
		
		count2 c = new count2();//동시 실행을 위해 아래에 각 함수를 스레드로 상속받아서 사용.
							  //외부 클래스(카운트, 날짜, 이미지)를 재정의 하여 바로 사용.
		day2 d = new day2();
		image2 e = new image2();
		
		c.start();//카운트, 날짜, 이미지 동시 실행.
		d.start();
		e.start();
		setVisible(true);//화면에 JFrame이 보이게끔 해준다.
	}
	
	/*
	 * public static void main(String[] args) { JFrame f = new JFrame("스레드 사용");
	 * //JFrame 선언 ThreadGraphic3 t = new ThreadGraphic3(); //JFrame을 상속받아 그 안에 스레드를
	 * 사용하여 동시 실행이 되게 한다. }
	 */
	
	public class image2 extends Thread { //이미지.java 외부 클래스를 재정의
		/*
		 * JLabel image; public image2(JLabel image) { this.image = image; }
		 */
		@Override
		public void run() {
			String[] list = {"다운로드1.jfif", "다운로드2.jfif", "다운로드3.jfif", "다운로드4.jfif", "다운로드5.jfif"};
			//그림 파일이 한정되어 있으므로, 배열의 크기만큼 이미지를 계속 불러올 것임.
			int i = 1;//그림의 순서, count가 10 될때마다 그림이 계속 바뀌게 한다.
			int pause = 0;// count를 500으로 설정했기 때문에, count가 0 이되서 멈추면 그림 전환도 자연스레 멈추도록 함.
			while (i < list.length ) {//그림이 다섯번째까지 다 돌면 다시 첫번째 그림으로 돌아가게 하려 함.
				ImageIcon icon = new ImageIcon("다운로드" + i + ".jfif");//프로젝트에 저장시킨 이미지 파일들을 순차적으로 불러올 것임.
				image.setIcon(icon);//이미지를 JFrame 안에 놓기 위함.
				try {
					Thread.sleep(5000);//그림이 5초마다 바뀌도록 함.(5000밀리초 = 5초)
				} catch (InterruptedException e) {
				}
				i++;//그림 순서가 바뀌도록 후위연산자 사용, 5초마다 배열 안의 그림이 다음 순서로 넘어간다.
				if (i == list.length) {//5번째 그림까지 다 왔다면,
					pause++;//count가 멈출때 같이 멈추게 할 변수.
					i = 1;//첫번쨰 그림으로 돌아간다.
					if (pause == 10) {//count 10마다 그림이 바뀌므로, 그림이 5번 바뀌면 pause가 1 증가한다.
									  //따라서 pause가 10 증가했을 때는 count가 0으로 된다.
						break;//이 때 그림 전환을 멈춘다.
					}
				}
			}
		}
	}
	
	public class count2 extends Thread {//카운트.java 외부 클래스 상속
		/*
		 * JLabel count; public count2(JLabel count) { this.count = count; }
		 */
		@Override//재정의
		public void run() {
			
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				try {
					Thread.sleep(500);//0.5초마다 count를 1씩 떨어뜨린다.
				} catch (InterruptedException e ) {
				}
			}
		}
	}
	
	public class day2 extends Thread {//이미지.java 외부 클래스 상속
		/*
		 * JLabel day; public day2(JLabel day) { this.day = day; } // 이건 외부 클래스를 쓸때만 소용이 있다...
		 */
		@Override
		public void run() {
			
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();//현재 시간을 띄운다.
				day.setText("날짜 : " + date);//현재 시간이 JFrame에 뜨도록 한다.
				try {
					Thread.sleep(1000);//시간이 1초마다 경과하는걸 보여준다.
				} catch (InterruptedException e ) {
				}
			}
		}
	}
}
