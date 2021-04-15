package 조건문;

import java.util.Scanner;

public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double temp = 3.141592;
//		System.out.printf("소수점 1자리까지는 %.1f ", temp);
//		String pw1;
//		String pw2;
//		System.out.println("설정할 암호는? ");
//		pw1 = sc.next();
//
//		System.out.println("암호를 대시오. ");
//		pw2 = sc.next();
		Float today_c;
		Float yesterday_c;


		Scanner sc = new Scanner(System.in); // 입력값을 받는다.
		System.out.println("오늘의 기온은? ");
		today_c = sc.nextFloat(); // 온도는 유리수이므로 Float형으로 받는다.

		System.out.println("어제의 기온은? ");
		yesterday_c = sc.nextFloat();

		float differ = yesterday_c - today_c;



		if (Math.abs(differ) > 2) { // Math 라이브러리 에서 절댓값 함수 사용
			System.out.println("기온차가 있으니 네이버 날씨 확인!"); // 어제와 2도 넘게 차이가 난다?
		} else {
			System.out.println("어제와 똑같은 옷차림으로!");
		}

	}

}
