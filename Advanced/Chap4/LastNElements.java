package Chap4;

import java.util.Scanner;	//���ϴ� ������ŭ ���� �Է¹޾� ��ڼ��� N�� �迭�� ������ N���� ����

class LastNElements {
	
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		final int N = 10;		//������ ����.
		int[] a = new int[N];	//�Է� ���� ���� ����
		int cnt = 0;			//�Է¹��� ����
		int retry;				//�ٽ� �� ��?
		
		System.out.println("������ �Է��ϼ���.");
		
		do {
			System.out.printf("%d��° ���� : ", cnt + 1);	//%d�� ������ �޴´�. cnt+1
			//cnt ������ 10�� �������� �ε���. ��� �ε��� 0, 1, 2, 3, 4, 5, 6, 7, 8, 9�� ����.
			a[cnt++ % N] = StdIn.nextInt();
			
			System.out.printf("��� �ұ��? (��.1/�ƴϿ�.0) : ");
			retry = StdIn.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) i = 0;	//���� �迭�� �� ������ �ʾƵ�, �Է¹��� ���� ǥ���Ҽ� �ֵ��� i �ʱ�ȭ.
		
		for (; i < cnt; i++)//cnt Ƚ����ŭ �ݺ��ؼ� �迭 �����ȿ� �ִ� ������ ���ʴ�� ������.
			//10�� ������ ��������, 11��° �Է¹��� ���� a[0]�� ����, 12��°�� a[2]�� ����....
			System.out.printf("%2d������ ���� = %d\n", i + 1, a[i % N]);
		
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
