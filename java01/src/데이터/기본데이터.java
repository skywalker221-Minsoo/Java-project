package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		// 기본데이터 4가지
		// 정수, 실수, 문자1, 논리
		// 문자1(char), 문자여러개(String
		int age = 100; // 4바이트
		double eye = 1.5; // 8바이트
		char gender = '남'; // 2바이트
		boolean food = true; // 1바이트

		// System.out.println("내 시력은 " + eye);
		// 자동완성 : Ctrl + space Bar
		// sysout, syso 쓰고 자동완성 시킨다.
		// Ctrl + F11 : 실행
		System.out.println("내 나이는" + gender);
		System.out.println("내 시력은" + eye);
		System.out.println("내 성별은" + gender);
		System.out.println("점심 유무" + food);
	}

}
