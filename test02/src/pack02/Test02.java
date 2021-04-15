package pack02;

import java.util.Random; // 랜덤으로 수를 할당할 수 있도록 외부 라이브러리 사용.

public class Test02 {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤으로 수를 입력받을수 있게 해준다.
		int[] num = new int[10]; // 자리가 10개인 int형 배열 생성.
		int sum = 0; // 누적합을 저장시키기 위한 변수 초기화.
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); // 0부터 99까지 숫자를 임의로 받을 수 있게 해준다.
			System.out.print(num[i] + " "); // 랜덤으로 입력받은 값 10개를 옆으로 나란히 출력
			sum = sum + num[i]; // 변수 값 누적
		}
		System.out.println();
		System.out.println(sum); // 랜덤으로 지정된 변수 10개의 합 누적.
		
		double d_num = (double)sum; // casting. 정수를 실수로 변환하여 소수점까지 출력되도록 한다.
		System.out.println(d_num / 10);
	}

}
