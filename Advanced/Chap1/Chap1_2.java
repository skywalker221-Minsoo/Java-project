package Chap1;

import java.util.Scanner;

public class Chap1_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");

	}
}
