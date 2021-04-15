package 조건문;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘의 점심은? ");
		String food = sc.next();
		switch (food) {
		case "분식":
			System.out.println("길건너로");
			break;
		case "양식":
			System.out.println("왼쪽으로");
			break;
		default:
			System.out.println("길건너로");
			break;
		}
	}

}
