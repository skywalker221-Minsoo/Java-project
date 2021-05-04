package shop;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			// 가방을 만들어서
			MemberVO bag = new MemberVO();
			// 가방에 값들을 넣은 다음에
			// 0 -> "0"
			bag.setId(String.valueOf(i));
			bag.setPw(i + ""); // 둘다 같은 의미
			bag.setName(i + "");
			bag.setTel(i + "");
			// list에 넣음
			list.add(bag);
		}
		System.out.println("리스트의 가방 갯수는? " + list.size() + "개");
		for (int j = 0; j < list.size(); j++) {
			MemberVO bag2 = list.get(j);
			System.out.print(bag2.getId());
			System.out.print(bag2.getPw());
			System.out.print(bag2.getName());
			System.out.print(bag2.getTel());
		}
		
	}

}
