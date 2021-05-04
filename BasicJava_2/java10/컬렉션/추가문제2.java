package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 추가문제2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		HashSet set = new HashSet();
		int[] num = new int[5000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(50000);
			set.add(num[i]);
		}
		
		System.out.println(set);
		System.out.println(set.size());
	}
}
