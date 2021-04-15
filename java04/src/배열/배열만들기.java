package 배열;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열(array) : 늘어놓다 라는 의미
		int [] num = new int[1000];
		System.out.println(num);
		
		int[] num2 = new int[5]; // 배열 생성, 크기 변경 불가, 초기화된 값 0이 들어감.
		num2[1] = 300;
		System.out.println(num2);
		System.out.println(num2[1]);
	}

}
