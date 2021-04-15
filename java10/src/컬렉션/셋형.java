package ÄÃ·º¼Ç;

import java.util.HashSet;

public class ¼ÂÇü {

	public static void main(String[] args) {
		
		HashSet bag = new HashSet(); 
		bag.add("ÈŞÁö");
		bag.add("º¼Ææ");
		bag.add("ÈŞ´ëÆù");
		bag.add("ÈŞ´ëÆù");
		System.out.println(bag.size());
		System.out.println(bag);
		bag.remove("ÈŞÁö");
		System.out.println(bag);
	}

}
