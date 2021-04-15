package 클래스사용;

import java.util.Date;

public class 반환받아보기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		int[] zero = re.add();
		double one = re.add(7.6, 8);
		int two = re.add(7, 3);
		String three = re.add(83, "하늘");
		String four = re.add("물", "고기");
		re.add2();
		//void인 메서드를 호출하는 경우에는
		//변수에 그 결과값을 넣을 수 없다!!
		//프린트도 안된다!!
		
		//메서드를 호출하고 나서 반환값이 있을 때만
		//변수에 그 결과값을 넣을 수도 있고
		//출력할 수도 있다.
		//String rest = re.add2(); => 반환값이 없어 변수에 저장 불가
		//System.out.println(re.add2()); => 마찬가지
		
		for (int x : zero) {
			System.out.print(x);
		}
		System.out.println();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		
		String s; // 일반클래스는 변수의 타입으로 사용할 수 있다.
		Date d = re.getDate();
		System.out.println(d);
		
		
	}

}
