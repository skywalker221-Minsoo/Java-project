package �迭;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ���Ź�ư�� {

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setSize(1000, 500);
      //���帣���� ������� ��ġ�� ���ִ� ��ǰ �ʿ�
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
//                System.out.println("��ư�� ��������.!");
                b.setBackground(Color.red);
                System.out.println("�¼���ȣ�� " + b.getText());
                // �¼���ȣ�� seat �迭�� index ���� ��> int�� ���� �ʿ�
                int index = Integer.parseInt(b.getText());
                // �迭�� �� index ���� 0�� ��� : ���Ű� �ȵ� ��Ȳ�̶� ����.
                // �迭�� �� index ���� 1�� ��� : ���Ű� �� ��Ȳ�̶� ����.
                seats[index] = 1;
//                b.setEnabled(false); // Ŭ������� ���´�.
                b.setEnabled(false);
                	
                };
             }
          );
      }
      
	  JButton b2 = new JButton();
      b2.setText("�����ϱ�");
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
        	System.out.println("����ݾ��� " + count * 10000 + "�� �Դϴ�.");
         }
      });
      f.setVisible(true);
   }

}