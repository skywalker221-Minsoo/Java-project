package pack02;

public class Test01 {

	public static void main(String[] args) {
		int[] num = new int[1000]; // 변수 자리가 1000개인 int형 배열 생성. 모든 자리의 값은 0으로 초기화.
		
		num[0] = 100; // 첫번째 자리에 정수 0을 100으로 대체.
		num[4] = 200; // 다섯번쨰 자리에 정수 0을 200으로 대체.
		num[9] = 300; // 열번째 자리에 정수 0을 300으로 대체
		num[999] = 500; // 마지막 자리에 정수 0을 500으로 대체.
		int count = 0; // 배열에 들어있는 값들의 개수를 세기 위한 변수 초기화.
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				count++; // 배열에 들어있는 값이 몇개인지 세어 준다.
			}
		}
		System.out.println("배열에 들어있는 값들의 개수 : " + count);
		System.out.println("1번째 위치: " + num[0]);
		System.out.println("5번째 위치: " + num[4]);
		System.out.println("10번째 위치: " + num[9]);
		System.out.println("1000번째 위치: " + num[999]);
	}

}
