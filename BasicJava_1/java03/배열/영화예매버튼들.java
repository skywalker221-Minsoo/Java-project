package 배열;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매버튼들 {

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setSize(1000, 500);
      //물흐르듯이 순서대로 배치를 해주는 부품 필요
      FlowLayout flow = new FlowLayout();
      f.setLayout(flow);
      
      int[] seats = new int[200];
      
      for (int i = 0; i < 200; i++) {
    	  JButton b = new JButton();
          b.setText(i+"");
          f.add(b);
          b.setBackground(Color.yellow);
          b.addActionListener(new ActionListener() {
             
             @Override
             public void actionPerformed(ActionEvent e) {
//                System.out.println("버튼을 눌렀군요.!");
                b.setBackground(Color.red);
                System.out.println("좌석번호는 " + b.getText());
                // 좌석번호가 seat 배열의 index 역할 ㅡ> int로 변경 필요
                int index = Integer.parseInt(b.getText());
                // 배열의 각 index 값이 0인 경우 : 예매가 안된 상황이라 가정.
                // 배열의 각 index 값이 1인 경우 : 예매가 된 상황이라 가정.
                seats[index] = 1;
//                b.setEnabled(false); // 클릭기능을 막는다.
                b.setEnabled(false);
                	
                };
             }
          );
      }
      
	  JButton b2 = new JButton();
      b2.setText("결제하기");
      f.add(b2);
      b2.setBackground(Color.green);
      
      b2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            int count = 0;
        	for (int i = 0; i < seats.length; i++) {
				if (seats[i] == 1) {
					count++;
				}
				
			} 
        	System.out.println("결재금액은 " + count * 10000 + "원 입니다.");
         }
      });
      f.setVisible(true);
   }

}