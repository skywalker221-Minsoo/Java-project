package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		String name;
		for (int i = 0; i < 5; i++) {
			System.out.println("수료 후 하고 싶은 것? ");
			name = sc.next();
			list.add(name);
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.size());
	}

}
