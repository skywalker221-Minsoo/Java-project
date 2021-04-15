package 조건문;

import javax.swing.JOptionPane;

public class 조건Basic {
	public static void main(String[] args) {

		String result = "";
		int i = 0;
		while (i < 4) {
			String food = JOptionPane.showInputDialog("먹고 싶은 점심 메뉴는 : "); // 입력값 String 형태로 받기.
			if (food.equals("짬뽕")) {
				result = "중국집으로";
				JOptionPane.showMessageDialog(null, result); 
			} else if (food.equals("우동")) {
				result = "일식집으로";
				JOptionPane.showMessageDialog(null, result);
			} else if (food.equals("라면")) {
				result = "분식집으로";
				JOptionPane.showMessageDialog(null, result);
			} else {
				result = "집으로";
				JOptionPane.showMessageDialog(null, result);
			}
			i += 1;
		}

		String price = JOptionPane.showInputDialog("무엇을 샀습니까? ");
		int money = 5000;

		if (price.equals("과자")) { // 입력 String 값과 기준이 되는 문자열과 비교
			JOptionPane.showMessageDialog(null, "어린아이군요!");
		} else if (price.equals("라면")) {
			JOptionPane.showMessageDialog(null, "성인이군요!");
		} else {
			JOptionPane.showMessageDialog(null, "뭔가를 샀군요!");
		}
		int sales_price = money - 1000;

		String result2 = "";
		String vip = JOptionPane.showInputDialog("당신은 VIP입니까? ");
		if (vip.equals("yes")) {
			result2 = "yes";
		} else {
			result2 = "no";
		}
		if (result2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "당신은 VIP 이므로 " + 
		"혜택가 적용하여 " + sales_price + "원입니다."); // 출력
		} else {
			JOptionPane.showMessageDialog(null, "당신은 VIP가 아니므로 " +
		money + "원입니다."); // 출력
		}

		/* String result = ""; */
		/* int i = 0; */
		while (i < 4) {
			String food = JOptionPane.showInputDialog("점수를 입력하세요 : ");
			int score = Integer.valueOf(food);

			if (score >= 90) {
				result = "A";
				JOptionPane.showMessageDialog(null, result); // 출력
			} else if (score >= 80) {
				result = "B";
				JOptionPane.showMessageDialog(null, result); // 출력
			} else if (score >= 70) {
				result = "C";
				JOptionPane.showMessageDialog(null, result); // 출력
			} else {
				result = "D";
				JOptionPane.showMessageDialog(null, result); // 출력
			}
			i += 1;
		}
	}
}
