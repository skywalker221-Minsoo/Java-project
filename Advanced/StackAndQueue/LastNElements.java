package StackAndQueue;

import java.util.Scanner;	//??? κ°??λ§νΌ κ°μ ?? ₯λ°μ ???κ°? N?Έ λ°°μ΄? λ§μ?λ§? Nκ°λ?? ???₯

class LastNElements {
	
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		final int N = 10;		//λ³??μ§? ??.
		int[] a = new int[N];	//?? ₯ λ°μ? κ°μ ???₯
		int cnt = 0;			//?? ₯λ°μ? κ°??
		int retry;				//?€? ? λ²??
		
		System.out.println("? ?λ₯? ?? ₯??Έ?.");
		
		do {
			System.out.printf("%dλ²μ§Έ ? ? : ", cnt + 1);	//%d? ? ?λ₯? λ°λ?€. cnt+1
			//cnt ??κΈ? 10? ?λ¨Έμ?κ°? ?Έ?±?€. κ³ λ‘ ?Έ?±?€ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9? ???₯.
			a[cnt++ % N] = StdIn.nextInt();
			
			System.out.printf("κ³μ ? κΉμ? (?.1/???€.0) : ");
			retry = StdIn.nextInt();
		} while (retry == 1);
		
		int i = cnt - N;
		if (i < 0) i = 0;	//λ§μ½ λ°°μ΄?΄ ?€ μ°¨μμ§? ???, ?? ₯λ°μ? κ°μ? ??? ? ??λ‘? i μ΄κΈ°?.
		
		for (; i < cnt; i++)//cnt ??λ§νΌ λ°λ³΅?΄? λ°°μ΄ κ³΅κ°?? ?? κ°λ€? μ°¨λ???λ‘? κΊΌλ΄?΄.
			//10κ°? ?¨?λ‘? ??΄μ§?κ³?, 11λ²μ§Έ ?? ₯λ°μ? κ°μ? a[0]? ???₯, 12λ²μ§Έ? a[2]? ???₯....
			System.out.printf("%2dλ²?Β? ? ? = %d\n", i + 1, a[i % N]);
		
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}