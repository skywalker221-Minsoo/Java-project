package Chap1;

import java.util.Scanner;

public class Chap1_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� �� : ");
			n= stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;	
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
