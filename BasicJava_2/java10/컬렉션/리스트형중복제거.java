package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList list = new ArrayList();
		int[] num = new int[5000];
		
		for (int i = 0; i < 5000; i++) {
			num[i] = r.nextInt(5000);
			list.add(num[i]);
		}
		
		HashSet set = new HashSet();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(set.size());
	}

}
