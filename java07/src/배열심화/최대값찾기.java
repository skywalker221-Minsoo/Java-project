package 배열심화;

import java.util.Random;

public class 최대값찾기 {

	public static void main(String[] args) {
		// 타입이 동일한 많은 양의 데이터가 있으면 배열에 넣어라.
		// 반복을 통해서 많은 양의 데이터를 효율적으로 다룰 수 있음.
		// int[] num = {11, 33, 55, 22, 44};		
		Random r = new Random();
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}		
		int max = num[0];
		int index = 0;
		int count = 0;
		String sum = "";
		
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num[index]) {
				sum = sum + i + " ";
				count++;
			}
		}
		String[] s = sum.split(" ");
		for (int i = 0; i < count; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최댓값 위치 : " + sum);
		System.out.println("최댓값 갯수 : " + count);
	}

}
