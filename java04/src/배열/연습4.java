package 배열;

import java.util.Random;

import 배열응용.다른패키지클래스;

// 많은 양의 자동 import : Ctrl + Shift + o

public class 연습4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int count = 0;
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1; // 45 = Seed값
			System.out.print(lotto[i] + " ");
		}
//		for (int i : lotto) {
//			System.out.print(i + " ");
//		}
		for (int x : lotto) {
			if(x >= 30) {
				count++;
			}
		}
		System.out.println("30이상의 수의 갯수는 " + count + "개");
	}

}
