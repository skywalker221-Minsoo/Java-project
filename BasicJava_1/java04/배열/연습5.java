package 배열;

import java.util.Random;

public class 연습5 {

	public static void main(String[] args) {
		Random r = new Random(); // 임의의 수를 할당하는 함수 import
		int[] num = new int[1000]; // int 1000개 공간을 가진 배열 생성
		int[] count = new int[4]; // 각 조건의 답을 세기 위한 배열 생성
						
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // num 배열 안에 0~999 의 숫자 1000개 배치
		}
		for (int j : num) {
			if (j >= 600) {
				count[0] += 1; // 600보다 크면 count
			} else if (j >= 500) {
				count[1] += 1; // 600보다 작은 수 중 500보다 큰 수 count
			} else if (j >= 400) {
				count[2] += 1; // 50보다 작은 수 중 400보다 큰 수 count
			} else if (j >= 300) {
				count[3] += 1; // 400보다 작은 수 중 300보다 큰 수 count
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((i+3) * 100 + " 이상의 갯수 : " + count[i]);
		}
	}

}
