package Chap1;

import java.util.Scanner;

public class Q9 {

	static int sumof(int a, int b) {
		int min;
		int max;
		
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		int sum = 0;
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}
	
	public void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("정수 " + a + "와 " + b + "사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
	}
}
