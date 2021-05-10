package Chap4;

import java.util.Scanner;	//원하는 갯수만큼 값을 입력받아 요솟수가 N인 배열에 마지막 N개를 저장

class LastNElements {
	
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		final int N = 10;		//변하지 않음.
		int[] a = new int[N];	//입력 받은 값을 저장
		int cnt = 0;			//입력받은 갯수
		int retry;				//다시 한 번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);	//%d는 정수를 받는다. cnt+1
			//cnt 나누기 10의 나머지가 인덱스. 고로 인덱스 0, 1, 2, 3, 4, 5, 6, 7, 8, 9에 저장.
			a[cnt++ % N] = StdIn.nextInt();
			
			System.out.printf("계속 할까요? (예.1/아니오.0) : ");
			retry = StdIn.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) i = 0;	//만약 배열이 다 차있지 않아도, 입력받은 값은 표시할수 있도록 i 초기화.
		
		for (; i < cnt; i++)//cnt 횟수만큼 반복해서 배열 공간안에 있는 값들을 차례대로 꺼내옴.
			//10개 단위로 끊어지고, 11번째 입력받은 값은 a[0]에 저장, 12번째는 a[2]에 저장....
			System.out.printf("%2d번쨰의 정수 = %d\n", i + 1, a[i % N]);
		
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
