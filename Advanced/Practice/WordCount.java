package Practice;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner StdIn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		String str = StdIn.nextLine();
		String str2 = str.replace(",", " ");
		String[] alphabet = str2.split(" "); 
		
		int countMan = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			//alphabet[i].replace(",", "");
			System.out.print(alphabet[i] + " ");
			if (alphabet[i].equals("���")) {
				countMan++;
			}
		}
		System.out.println("���: ���(" + countMan + ")");
	}
}
