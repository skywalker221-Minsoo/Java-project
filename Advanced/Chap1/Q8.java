package Chap1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = (1 + n) * 5;
		System.out.println("1부터 " + n + "까지의 정수 합은 " + sum + "입니다.");
	}

}
