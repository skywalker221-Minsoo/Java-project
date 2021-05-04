package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 그래픽입문4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		t1.setBounds(279, 71, 150, 43);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBounds(279, 154, 150, 43);
		f.getContentPane().add(t2);
		
		JButton btnNewbutton = new JButton("\uB85C\uADF8\uC778");
		btnNewbutton.setBackground(Color.RED);
		btnNewbutton.setForeground(Color.WHITE);
		btnNewbutton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. 입력한 t1, t2값을 가지고 와야한다.
				String s1 = t1.getText();
				String s2 = t2.getText();
				//2. 내가 지정한 id/pw와 동일한지 확인
				//3. 결과를 출력!
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");

				}
			}
		});
		btnNewbutton.setBounds(88, 254, 410, 97);
		f.getContentPane().add(btnNewbutton);
		
		JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514:");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(91, 71, 131, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(91, 154, 131, 43);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600, 600);
		f.setVisible(true);
	}
}
