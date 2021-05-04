package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 배열을정렬 {

	public static void main(String[] args) {
		int[] num = new int[100];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		Arrays.sort(num); // 오름차순 정렬. 파괴함수(원본을 바꿔버린다.)
		for (int x : num) {
			System.out.println(x);
		}
		System.out.println("제일 큰 수 : " + num[num.length-1]);
		System.out.println("제일 작은 수 : " + num[0]);
	}

}
