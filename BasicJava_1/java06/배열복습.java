package 배열응용;

import java.util.Random;

public class 배열복습 {

	public static void main(String[] args) {
		// 배열을 사용하는경우
		// 1. 배열을 만드는 순간 데이터를 모르는 경우
		//    공간을 만들어 두었다가 나중에 넣는다.
		String[] name = {"홍길동", "박길동", "정길동", "이길동"};
		int[] num = new int[5];
		Random r = new Random(42);
		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = r.nextInt(100); // 0 ~ 99 까지의 임의의 정수
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		for (String s : name) {
//			System.out.print(s + " ");
//		}			
		// 2. 배열을 만드는 순간 데이터를 아는 경우
		//    배열생성할 때 바로 데이터를 넣는다.
		int[] num2 = {10, 20, 30, 40, 50}; // 지역변수 : 지역 밖(외부 클래스)에서는 사용 불가
		// num2 = 주소, 데이터가 들어가 있으면 참조형 변수
		// 지역변수
		// 이 지역 안에서 만들어지는 변수는 지역 밖에서는 인식 불가
		// 변수는 만들어지는 위치 지역 안에서만 사용 가능
		// 변수는 언제 만들어지는가? 타입 변수명;(선언)
		// System.out.println(test);
		// 1. 오타! 해당 변수가 존재하는지 확인
		// 2. 특정한 범위 안에서 쓸 수 있는 지역변수가 아닌지 확인
		// 3. 사용하려고 하는 라인보다 아래에서 만들어진 것은 아닌지 확인
		// test는 사용 불가. 58라인에서는 아직 test가 만들어지지 않음.
		
		char[] gender = {'남', '여', '남', '여'};
//		for (int i = 0; i < gender.length; i++) {
//			System.out.print(gender[i] + " ");
//		}
//		for (char c : gender) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		boolean[] breakfast = {true, false, true, false};
//		for (int i = 0; i < breakfast.length; i++) {
//			System.out.print(breakfast[i] + " ");
//		}
//		for (boolean c : breakfast) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		double[] sight = {0.15, 2.0, 1.2, 0.8};
//		for (int i = 0; i < sight.length; i++) {
//			System.out.print(sight[i] + " ");
//		}
//		for (double c : sight) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		int[] age = {100, 200, 300, 400};
//		for (int i = 0; i < age.length; i++) {
//			System.out.print(age[i] + " ");
//		}
//		for (int c : age) {
//			System.out.print(c + " ");
//		}
		System.out.println();
		System.out.println("이름" + " " + "나이" + " " + "아침" + " " + "성별" + " " + "시력" + " ");
		System.out.println("----------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + age[i] + " " + breakfast[i] + " " + gender[i] + " " + sight[i] + " ");
		}
		
	}

}
