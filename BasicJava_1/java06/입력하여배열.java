package 배열응용;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class 입력하여배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[3]; // {null, null, null}
		JButton[] b = new JButton[3]; // {null, null, null}
		
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("가고싶은 곳은? ");
		}
		
		for (String x : s) {
			System.out.print(x + " ");
		}
		
		// 배열 안 내용 확인
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("제주도")) { // 참조형에서 == 를 쓰면 주소를 비교!!
				System.out.println("제주도가 있음");
				System.out.println("위치는 " + i);
			}
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("오늘 해야할 일은? ");
//		todo_list = sc.next();
	}

}
