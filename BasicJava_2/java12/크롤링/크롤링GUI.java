package 农费傅;

import javax.swing.JFrame;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import 颇老历厘.Diary;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 农费傅GUI {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JButton 农费傅 = new JButton("\uD06C\uB864\uB9C1");
		农费傅.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					农费傅历厘楷嚼促矫.crawling();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		农费傅.setBounds(108, 365, 143, 45);
		f.getContentPane().add(农费傅);
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9\uD560 \uAE08\uC694\uC77C \uC6F9\uD230\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		lblNewLabel.setBounds(63, 56, 223, 35);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(93, 139, 158, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);;
		f.setVisible(true);

	}

}
