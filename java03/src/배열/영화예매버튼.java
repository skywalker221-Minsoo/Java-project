package �迭;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ���Ź�ư {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		JButton b = new JButton();
		b.setText("�¼�");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(b);

		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ��������.");
				
			}
		});
		f.setVisible(true);
	}

}
