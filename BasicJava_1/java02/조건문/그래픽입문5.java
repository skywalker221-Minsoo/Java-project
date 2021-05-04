package Á¶°Ç¹®;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class ±×·¡ÇÈÀÔ¹®5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
      JFrame   f = new JFrame();
      f.getContentPane().setBackground(Color.GREEN);
      f.setSize(600, 645);
      f.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uBA39\uACE0 \uC2F6\uC740 \uC74C\uC2DD");
      lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 30));
      lblNewLabel.setBounds(31, 25, 246, 69);
      f.getContentPane().add(lblNewLabel);
      
      t1 = new JTextField();
      t1.setBackground(Color.YELLOW);
      t1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      t1.setBounds(301, 25, 267, 60);
      f.getContentPane().add(t1);
      t1.setColumns(10);
      
      JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
			String s = t1.getText();
			if (s.equals("¶ó¸é")) {
				JOptionPane.showMessageDialog(f, "ºÐ½ÄÁý");
			} else if (s.equals("Â«»Í")) {
				JOptionPane.showMessageDialog(f, "Áß±¹Áý");
			} else {
				JOptionPane.showMessageDialog(f, "Áý");
			}	
      	}
      });
      btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 30));
      btnNewButton.setBounds(41, 109, 515, 51);
      f.getContentPane().add(btnNewButton);
      
      JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294");
      lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      lblNewLabel_1.setBounds(19, 184, 246, 69);
      f.getContentPane().add(lblNewLabel_1);
      
      t2 = new JTextField();
      t2.setFont(new Font("±¼¸²", Font.BOLD, 30));
      t2.setColumns(10);
      t2.setBackground(Color.PINK);
      t2.setBounds(301, 189, 267, 60);
      f.getContentPane().add(t2);
      
      JButton btnNewButton_1 = new JButton("\uB098\uC758 \uB0B4\uB144\uB098\uC774\uB294?");
      btnNewButton_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		String b = t2.getText();
			JOptionPane.showMessageDialog(f, Integer.parseInt(b)+1 + "¼¼");
      	}
      });
      btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      btnNewButton_1.setBounds(29, 268, 515, 51);
      f.getContentPane().add(btnNewButton_1);
      
      JLabel lblNewLabel_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
      lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      lblNewLabel_1_1.setBounds(35, 339, 246, 69);
      f.getContentPane().add(lblNewLabel_1_1);
      
      t3 = new JTextField();
      t3.setFont(new Font("±¼¸²", Font.BOLD, 30));
      t3.setColumns(10);
      t3.setBackground(Color.CYAN);
      t3.setBounds(311, 343, 267, 60);
      f.getContentPane().add(t3);
      
      JButton btnNewButton_1_1 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
      btnNewButton_1_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
			String s1 = t3.getText();
			String s2 = t4.getText();
			JOptionPane.showMessageDialog(f, (Integer.valueOf(s1) + Integer.valueOf(s2))/2);
      	}
      });
      btnNewButton_1_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      btnNewButton_1_1.setBounds(47, 512, 515, 51);
      f.getContentPane().add(btnNewButton_1_1);
      
      JLabel lblNewLabel_1_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
      lblNewLabel_1_1_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
      lblNewLabel_1_1_1.setBounds(31, 418, 246, 69);
      f.getContentPane().add(lblNewLabel_1_1_1);
      
      t4 = new JTextField();
      t4.setFont(new Font("±¼¸²", Font.BOLD, 30));
      t4.setColumns(10);
      t4.setBackground(Color.CYAN);
      t4.setBounds(307, 422, 267, 60);
      f.getContentPane().add(t4);
      f.setVisible(true);
   }
}