package Chap1;

import java.util.Scanner;

public class Q10 {

	public void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		b = 0;
		
		do {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
		} while (a >= b);
		
		System.out.println(b + " - " + a + "는 " + (b - a) + "입니다.");
	}
}
