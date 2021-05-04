package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자 : + - * / %
		// 한줄복사 : 커서, Ctrl + Alt + 화살표 아래
		// 한줄이동 : 커서, Alt + 화살표방향
		// 이전 취소 : Ctrl + z
		// 한줄 삭제 : Ctrl + d
		int x = 200;
		int y = 100;
		
		// 연산 : CPU가 하는 간단한 처리
		// 연산자(기호) : 간단한 처리는 코딩상에 기호로 표시한다.
		int sum = x + y;
		System.out.println(x + "+" + y + "=" + sum);
		int minus = x - y;
		System.out.println(x + "-" + y + "=" + minus);
		int mul = x * y;
		System.out.println(x + "*" + y + "=" + mul);
		int odd = x / y;
		System.out.println(x + "/" + y + "=" + odd);
	}

}
