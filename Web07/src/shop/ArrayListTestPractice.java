package shop;

import java.util.ArrayList;

public class ArrayListTestPractice {

	public static void main(String[] args) {
		ArrayList<BoardVO> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BoardVO bag = new BoardVO();
			
			bag.setId(String.valueOf(i));
			bag.setPw(i + "");
			
			list.add(bag);
		}
		System.out.println("리스트 가방 갯수 : " + list.size() + "걔");
		
		for (int i = 0; i < list.size(); i++) {
			BoardVO bag2 = list.get(i);
			System.out.print(bag2.getId());
			System.out.print(bag2.getPw() + " ");
		}

	}

}
