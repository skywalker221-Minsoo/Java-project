package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//순서가 있는 데이터들의 모임
		
		list.add("먹기");
		list.add("마시기");
		list.add("운동");
		//System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(1, "쉬기");
		System.out.println(list);
		System.out.println(list.size());
	}

}
