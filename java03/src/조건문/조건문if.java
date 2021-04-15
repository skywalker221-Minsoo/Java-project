package 조건문;

import java.util.Date;
import java.util.concurrent.locks.Condition;

import javax.swing.JButton;

public class 조건문if {

	public static void main(String[] args) {
		// new 키워드 이용. Date틀에 대한 부품을 찍어낸다.
		Date date = new Date(); // 날짜와 시간에 대한 정보를 알려주는 class
		int hour = date.getHours(); // 24시각제로 받는다.
		System.out.println("현재 시각은" + hour + "시");
		if (hour <= 11) {
			System.out.println("굿모닝");
		} else if (hour <= 16) {
			System.out.println("굿에프터눈");
		} else if (hour <= 22) {
			System.out.println("굿이브닝");			
		} else {
			System.out.println("굿나잇");
		}
	}
}
