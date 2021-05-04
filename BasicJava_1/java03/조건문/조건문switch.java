package 조건문;

import java.util.Date;

public class 조건문switch {

	public static void main(String[] args) {
		// 조건이 많을 때 사용, 조건이 특정값인 경우
		Date date = new Date();
		int month = date.getMonth() + 1;
		System.out.println("오늘은 " + month + "월입니다." );
		// switch(변수) -> 정수, 문자1, String 까지만!!! 실수는 사용 불가.
		switch (month) {
		case 2:
			System.out.println("28일까지 있음.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있음.");
		default:
			System.out.println("31일까지 있음.");
			break;
		}
	}

}
