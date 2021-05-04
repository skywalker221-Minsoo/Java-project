package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동"); //0번 인덱스
		list.add(11.22);
		list.add(12);
		//boxing : int(기본형) ---> auto-boxiong ---> Integer(참조형) ---> upcasting ---> Object
		
		int num = (Integer)list.get(2);
		//unboxing : int(기본형) <--- auto-boxiong <--- Integer(참조형) <--- downcasting <--- Object
		
		System.out.println(list);
		//list.get(0).charAt(0);
		//list.get(1).run();
		//String에서 추가된 메서드들은 바로 쓸 수 없다.
		//String의 추가 기능을 사용하고 싶으면 다시 String으로 형변환해주면 된다.
		//String(작) <--- Object(큰), (String)변수
		String name = (String)list.get(0);
		System.out.println(name.charAt(1));
		
	}
}
