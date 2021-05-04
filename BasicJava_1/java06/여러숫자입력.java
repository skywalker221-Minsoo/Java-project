package 배열응용;

import javax.swing.JOptionPane;

public class 여러숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3]; // {0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력 ");
			int data2 = Integer.parseInt(data);
			num[i] = data2;
		}
		for (int i : num) {
			System.out.print(i + " ");
		}
		int sum = 0; // 변수가 초기화 되지 않으면? 쓰레기값이 들어있다.(변수로써 쓸 수 없는 상태)
		for (int i : num) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("합 : " + sum);
		System.out.print(String.format("%.2f", sum / (double)num.length)); // 소수점 출력. avg = sum / 표본 수
	}

}
