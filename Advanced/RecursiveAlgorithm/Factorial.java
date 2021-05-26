package RecursiveAlgorithm;

import java.util.Scanner;
//���丮���� ��������� ����.

public class Factorial {
	//���� ���� n�� ���丮���� ��ȯ�մϴ�.
	static long factorial(long n) {
		if (n > 0)
			return n * factorial(n - 1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		long x = StdIn.nextInt();
		
		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}
}
