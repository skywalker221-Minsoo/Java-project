package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인");
		//static 변수: 객체생성하지 않아도 언제든지 클래스 이름으로 접근해서
		//			   바로 그 변수의 값을 갖다 쓸수 있는 변수
		//			   그래픽 프로그램에서는 Font의 속성, Color의 값 등을
		//			   자주 쓰므로 static 변수로 만들어두어서 편하게 쓸 수 있다.
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(45, 39, 255, 128);
		f.getContentPane().add(top);
		
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(57, 196, 93, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(57, 245, 102, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setForeground(Color.BLACK);
		t1.setBounds(184, 189, 116, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setForeground(Color.BLACK);
		t2.setColumns(10);
		t2.setBounds(184, 238, 116, 42);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //id입력
				String s2 = t2.getText(); //pw입력
				//root, 1234 동일하면 "로그인 성공", 동일하지 않으면 "로그인 실패"
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					Diary diary = new Diary(); // 다른 창을 불러온다.
					diary.open(); // 그 창을 연다.
					f.dispose(); // 로그인창을 닫는다.
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		login.setBounds(34, 295, 125, 98);
		f.getContentPane().add(login);
		
		ImageIcon icon2 = new ImageIcon("btn1.png");
		login.setIcon(icon2);
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 처리내용
				//t1, t2 입력한 내용을 지운다.
				t1.setText("");
				t2.setText("");				
			}
		});
		reset.setBounds(187, 295, 125, 98);
		f.getContentPane().add(reset);
		
		ImageIcon icon3 = new ImageIcon("btn2.png");
		reset.setIcon(icon3);
		
		f.setVisible(true);
	}
}
