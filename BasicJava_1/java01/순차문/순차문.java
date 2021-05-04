package 제어문.순차문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("이름을 입력하세요"); // 입력
		String result = name + "님 환영합니다."; // 처리
		JOptionPane.showMessageDialog(null, result); // 출력
		
	}

}
