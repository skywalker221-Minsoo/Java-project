package yesterday;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		String physics = JOptionPane.showInputDialog("체육점수 :  ");
		String math = JOptionPane.showInputDialog("수학점수 : ");
		String english = JOptionPane.showInputDialog("영어점수 : ");
		String korean = JOptionPane.showInputDialog("국어점수 : ");
		
		float avg = (Integer.valueOf(physics) + Integer.valueOf(math) +
				Integer.valueOf(korean) + Integer.valueOf(english)) / 4;
			
		JOptionPane.showMessageDialog(null, "평균 : " + avg); // 출력
		
		double pi = 3.141592;
		String round = JOptionPane.showInputDialog("반지름 : ");
		double round2 = Double.valueOf(round);
		double Static = pi * round2 * round2;
		JOptionPane.showMessageDialog(null, "면적 : " + Static); // 출력

//		String name;
//		int age;
//		double height;
//		String intro;
//		String buffer;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요. ");
//		name = sc.next();
//		
//		System.out.println("나이를 입력하세요. ");
//		age = sc.nextInt();
//		
//		System.out.println("키를 입력하세요. ");
//		height = sc.nextDouble();
//		
//		System.out.println("자기소개를 입력하세요. ");
//		buffer = sc.nextLine();
//		intro = sc.nextLine();
//		
//		System.out.println("이름은 " + name + " 나이는 " + age + " 키는 " + height);
//		System.out.println(intro);
//
//		char pw1 = 'p';
//		char pw2 = 'q';
//		if (pw1 == pw2) { // true
//			System.out.println("PASS");
//		} else { // false
//			System.out.println("재입력");
//		}
		
		double temp = 3.141592;
		System.out.printf("소수점 1자리까지는 %.1f ", temp);

		Float today_weight;
		Float yesterday_weight;
		String pw1;
		String pw2;

		Scanner sc = new Scanner(System.in);
		System.out.println("오늘의 몸무게는? ");
		today_weight = sc.nextFloat();

		System.out.println("어제의 몸무게는? ");
		yesterday_weight = sc.nextFloat();

		float differ = yesterday_weight - today_weight;

		System.out.println("설정할 암호는? ");
		pw1 = sc.next();

		System.out.println("암호를 대시오. ");
		pw2 = sc.next();

		if (pw1.equals(pw2) && differ > 2) { // true
			System.out.println("다이어트 성공!!");
		} else {
			System.out.println("내일 다시 도전!");
		}

	}

}
