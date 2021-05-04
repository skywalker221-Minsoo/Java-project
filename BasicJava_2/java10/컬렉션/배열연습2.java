package 컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

public class 배열연습2 {

	public static void main(String[] args) {
		
		ArrayList award = new ArrayList();
		award.add("박스키");
		award.add("송스키");
		award.add("김스키");
		award.add("정스키");
		System.out.println(award);
		for (int i = 0; i < award.size(); i++) {
			System.out.println("시상자 " + (i+1) + "등 : " + award.get(i));
		}
		
		award.remove("송스키");
		for (int i = 0; i < award.size(); i++) {
			System.out.println("시상자 " + (i+1) + "등 : " + award.get(i));
		}
		

	}

}
