package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(new 맨());
		list.add(new Random());
		list.add(new 수퍼맨());
		list.add(12);
		System.out.println(list);
		//list.get(0).charAt(0);
		//list.get(1).run();
		//String에서 추가된 메서드들은 바로 쓸 수 없다.
		//String의 추가 기능을 사용하고 싶으면 다시 String으로 형변환해주면 된다.
		//String(작) <--- Object(큰), (String)변수
		String name = (String)list.get(0);
		System.out.println(name.charAt(1));
		
		맨 man = (맨)list.get(1); //강제형변환, 타입을 항상 지정해주도록 하자.
		man.run();
		
		수퍼맨 superman = (수퍼맨)list.get(3);
		superman.space();
		
		Random r = (Random)list.get(2);
		System.out.println(r.nextInt());
	}
}
