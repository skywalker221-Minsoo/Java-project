package Practice;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner StdIn = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String str = StdIn.nextLine();
		String str2 = str.replace(",", " ");
		String[] alphabet = str2.split(" "); 
		
		int countMan = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			//alphabet[i].replace(",", "");
			System.out.print(alphabet[i] + " ");
			if (alphabet[i].equals("사람")) {
				countMan++;
			}
		}
		System.out.println("결과: 사람(" + countMan + ")");
	}
}
