package 반복문;

import javax.swing.JOptionPane;

public class 반복문while {

	public static void main(String[] args) {
		while (true) {
			String data = JOptionPane.showInputDialog("0>아이유, 1)유재석, 2)박명수, 3)종료");
			if (data.equals("3")) {
				System.out.println("투표시스템을 종료합니다.");
				break;
			}

			switch (data) {
			case "0":
				System.out.println("아이유");
				break;
			case "1":
				System.out.println("유재석");
				break;
			case "2":
				System.out.println("박명수");
				break;
			default:
				System.out.println("해당 연예인이 없습니다.");
				break;
			}
		}
	}
}
