package 배열응용;

import java.util.Random;

public class 토익 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] 답안 = new int[990];
		int[] 내답 = new int[990];
		
		for (int i = 0; i < 답안.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 1 ~ 4 랜덤 입력
			내답[i] = r.nextInt(4) + 1;
			System.out.println(i+1 + " : " + "답안 : " + 답안[i] + " / 내답 : " + 내답[i]);
		}
		
		int count = 0;
		for (int i = 0; i < 답안.length; i++) {
			if (답안[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("맞은 갯수 : " + count);
	}

}
