package 배열;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 750);
		JButton b = new JButton();
		b.setText("좌석");
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(b);

		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요.");
				
			}
		});
		f.setVisible(true);
	}

}
