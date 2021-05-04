package 계산기;

import java.util.Date;

public class 계산기 {
	
	public int getHour() { // int 함수를 써서 결과값을 반환한다!!
		Date date = new Date();
		int result = date.getHours(); // 현재시각 return
		return result;
	}
	
	
	public int add(int a, int b) { // void함수 쓰면 return값을 받을 수가 없다!!!!
		// 메소드의 입력값이 있는 경우,
		// 입력되는 값의 타입과 수에 따라 변수를 만들어주어야
		// 전달되는 값을 받아서 저장해두었다가
		// 꺼내서 계산할 수 있다.
		System.out.println("두 수의 합은 : "+ (a + b));
		int result = a + b;
		return result; // 결과값을 반환한다.
	}
	
	public int minus(int a, int b) {
		// a, b를 중간에 값을 전달받은 변수라고 해서
		// 매개체 역할을 해주는 변수 : 매개변수, parameter, 파라메터
		// 전달받은 값이 2개이면, 매개변수 2개를 만들어주어야함.
		// 전달받은 값이 순서대로 매개변수에 저장됨.
		// 이렇게 저장된 값을 가지고 메서드 내에서 처리하게 됨.
		System.out.println("두 수의 차는 : "+ Math.abs(a - b));
		int result = a - b;
		return result;
	}
	
	public int mul(int x, int y) {
		System.out.println("두 수의 곱은 : "+ (x * y));
		int result = x * y;
		return result;
	}
	
	public double div(double x, double y) {
		System.out.printf("두 수의 나눗셈은 : %.2f", (x / y));
		double result = x / y;
		return result;
	}
	
}
