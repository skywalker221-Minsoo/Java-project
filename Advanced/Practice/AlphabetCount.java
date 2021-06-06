package Practice;

import java.util.Scanner;

public class AlphabetCount {

	public static void main(String[] args) {
		
		Scanner StdIn = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요 : ");
		String str = StdIn.next();
		String[] alphabet = str.split("");
		
		int countA = 0;
		int countB = 0;
		int countC = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i].equals("a")) {
				countA++;
			}
			else if (alphabet[i].equals("b")) {
				countB++;
			}
			else if (alphabet[i].equals("c")) {
				countC++;
			}
		}
		System.out.println("a(" + countA + "), b(" + countB + "), c(" + countC + ")");
	}
}
