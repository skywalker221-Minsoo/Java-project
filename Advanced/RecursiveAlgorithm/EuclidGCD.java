package RecursiveAlgorithm;

import java.util.Scanner;
//��Ŭ���� ȣ�������� �ִ����� ���ϱ�

public class EuclidGCD {
	//���� x,y�� �ִ������� ���Ͽ� ��ȯ�մϴ�.
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.println("������ �Է��ϼ��� : "); int x = StdIn.nextInt();
		System.out.println("������ �Է��ϼ��� : "); int y = StdIn.nextInt();
		
		System.out.println("�ִ������� " + gcd(x, y) + "�Դϴ�.");
	}
	
}
