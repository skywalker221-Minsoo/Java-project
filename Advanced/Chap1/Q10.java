package Chap1;

import java.util.Scanner;

public class Q10 {

	public void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("a�� �� : ");
		a = stdIn.nextInt();
		b = 0;
		
		do {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
		} while (a >= b);
		
		System.out.println(b + " - " + a + "�� " + (b - a) + "�Դϴ�.");
	}
}
