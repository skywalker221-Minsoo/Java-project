package 컬렉션;

import java.util.HashSet;

public class 추가문제 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "양파", "감자", "고구마"};
		HashSet del = new HashSet();
		
		for (int i = 0; i < food.length; i++) {
			del.add(food[i]);
		}
		System.out.println(del);
	}

}
