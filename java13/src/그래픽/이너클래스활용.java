package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

public class 이너클래스활용 extends JFrame { // Jframe을 상속받아서 사용하기 메서드를 사용하기 위함.
      JLabel count, img, day; // 전역변수로 선언해서 전체에서 사용할 수 있게한다.
      // 저기 변수에 스레드를 하는 innerclass를 넣어야 한다.
   public 이너클래스활용() { // 이너클래스활용이 JFrame을 상속 받았기 때문에 JFrame의 메서드를 객체 없이 사용할 수 있다.
      
      setSize(800, 1000);
      getContentPane().setLayout(null);

      // 각 변수값을 class 전체에서 사용할 수 있게 전역변수 자리로 이동시켜준다.
      // 전역변수로 이동하면 객체 없이 바로 사용할 수 있다.
      count = new JLabel(""); // 전역변수로 사용하기 때문에 객체 생성 없이 가능
      count.setFont(new Font("Dialog", Font.BOLD, 30));
      count.setBounds(280, 38, 310, 86);
      getContentPane().add(count);

      img = new JLabel("");
      img.setBounds(52, 122, 639, 656);
      getContentPane().add(img);

      day = new JLabel("");
      day.setFont(new Font("Dialog", Font.BOLD, 30));
      day.setBounds(68, 769, 623, 99);
      getContentPane().add(day);
      
      count2 c = new count2();
      c.start();
      Image2 i = new Image2();
      i.start();
      day2 d = new day2();
      d.start();

      setVisible(true);
   }

   public static void main(String[] args) {
      JFrame f = new JFrame("innerclass"); // 먼저 이너클래스를 활용해서 노출 시킬 프레임 생성
      이너클래스활용 g = new 이너클래스활용(); // 이너클래스활용 class에서 Jframe을 상속받기 위해 객체 생성
      // 메인 밖으로 뺀 이너클래스활용 class를 메인에서 사용하기 위해 객체를 생성해 준다.

   }// main 
   // main과 class 사이에 innerclass를 넣을 수 있다.
   public class count2 extends Thread {// 슈퍼클래스를 처음 생성할때 스레드로 지정할 수 있다.
      @Override // 오버라이딩을 통해서 run을 재정의해서 사용
      public void run() {
         for (int i = 10; i >= 0; i--) {
            // System.out.println("count : " + i); // 인덱스값이 하나씩 내려가면서 출력 
            // JFrame에 값을 넣어주는 걸로 변경
            count.setText("카운트 : " + i);
            try {
               Thread.sleep(1000); // 1초의 의미(동시프로그램 진행시 속도조절해주는 기능)
               // 500 -> 0.5초의 의미
            } catch (Exception e) {
               // 인터럽트(방해, 중단) : ESC, ctrl+c, power-off, alt+f4 
            }
         }
      }
   }
   
   public class Image2 extends Thread {
      @Override
      public void run() {
         String[] list = {"다운로드1.jfif", "다운로드2.jfif", "다운로드3.jfif", "다운로드4.jfif", "다운로드5.jfif"};
         // 인덱스 순번을 활용하여 사진 출력 -> 배열 사용!
         int count2 = 2;
         for (int i = 0; i < list.length; i++) {
            // System.out.println("이미지 : " + list[i] ); JFrame에 값을 넣어주는 걸로 변경
            ImageIcon icon = new ImageIcon(list[i]); // 이미지를 넣을 수 있는 객체 생성
            img.setIcon(icon); // 전역변수 img에 icon이미지를 넣는다
            if (i == 4) {
               i = -1;
            }
            try {
               Thread.sleep(5000); // 5초에 한번씩 진행
            } catch (Exception e) {
               
            }
            count2--;
            if (count2 < 0) { // 이러면 그림 바뀌고 0.001초 오차에 따라 바로 멈춘것처럼 보인다.
                break;
            }
         }
      }
   }
   
   public class day2 extends Thread{ // 직접 타이핑으로도 상속 가능
      @Override // run을 재정의하는 오버라이딩
      public void run() {
    	 int count3 = 10;
         for (int i = 0; i < 1000; i++) { // 1000번 반복
            Date date = new Date(); // 날짜를 나타내는 객체 사용
            // System.out.println("날짜 : " + date); JFrame에 값을 넣어주는 걸로 변경
            day.setText(date + " ");
            try {
               Thread.sleep(1000); // 1호체 한번식 진행(동시프로그램 처리시 시행간격을 조정할 수 있다)
            } catch (Exception e) {
               
            }
            count3--;
            if (count3 < 0) { //이러면 시간 바뀌고 0.001초의 오차에 따라 바로 멈추는 것처럼 보인다.
            	break;
            }
         }
      }
   }



}// class