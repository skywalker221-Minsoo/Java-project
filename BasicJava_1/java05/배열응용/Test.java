package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

   public static void main(String[] args) {

      JFrame f = new JFrame();
      f.setSize(1000, 450);

      // 물흐르듯이 순서대로 배치를 해주는 부품 필요
      FlowLayout flow = new FlowLayout();
      f.setLayout(flow);

      int[] seat = new int[200]; // {0,0,0,0,0,0,0...0}

      for (int i = 0; i < 200; i++) {
         JButton b = new JButton();
         b.setText(i + ""); // b버튼에 i라는 텍스트를 넣어줘. 그런데 i는 정수이기때문에 ""를 더해줘서 string으로 바꿔줘야함
         f.add(b); // f 프레임에 버튼 넣어줘

         b.setBackground(Color.pink); // 버튼배경 바꿔줘. (color 도 부품이라서 대문자, 자동완성 필수)

         // b라는 버튼에 기능을 넣어줘
         b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               // 버튼눌렀을 때 처리하고싶은 것들 밑으로 넣어줌
               System.out.println("버튼을 눌렀군요.!");
               b.setBackground(Color.red);
               System.out.println("좌석번호는" + b.getText()); // "100"string

               // 좌석번호가 seat배열의 index역할! => int
               int index = Integer.parseInt(b.getText()); // 100 int

               // 배열의 각 index의 값 0인 경우 : 예매가 안된 상황이라고 가정
               // 배열의 각 index의 값 1로 변경한 경우 : 예매가 된 상황이라고 가정

               seat[index] = 1; // seat[100] = 1;
               b.setEnabled(false); // 클릭기능을 막음. (선택된건 더 클릭이 안됨)

            }
         });
      } // for문

      JButton b2 = new JButton();
      b2.setText("결제하기");
      f.add(b2); // f 프레임에 버튼 넣어줘

      b2.setBackground(Color.green); // 버튼배경 바꿔줘. (color 도 부품이라서 대문자, 자동완성 필수)

      // b라는 버튼에 기능을 넣어줘
      b2.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            // seat배열에 있는 값 하나씩 가지고 와서, 각 값이 1인 경우
            int count = 0;
            for (int i = 0; i < seat.length; i++) {
               if (seat[i] == 1) {
                  // 예매된 자리입니다라고 프린드
                  System.out.println(i + " >> 예매된 자리입니다.");
                  // 카운트!
                  count++;
                  // 결제금액!
                  System.out.println("결제금액은 " + count * 10000 + "원");
               }
            }
         }
      });

      f.setVisible(true);

   }

}