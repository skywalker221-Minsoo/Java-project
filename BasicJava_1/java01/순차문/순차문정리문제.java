package 제어문.순차문;

import javax.swing.JOptionPane;

public class 순차문정리문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = JOptionPane.showInputDialog("당신의 취미는 ");
		String trip = JOptionPane.showInputDialog("당신의 여행지는 ");
		
//		String result1 = "당신의 취미는 " + hobby;
//		String result2 = "당신의 여행지는 " + trip;
//		JOptionPane.showInputDialog(null, result1); // 출력
//		JOptionPane.showInputDialog(null, result2); // 출력
		JOptionPane.showMessageDialog(null, "당신은 " + trip + "로 " + hobby + "를 즐기러 간다."); // 출력
		 
	}

}
