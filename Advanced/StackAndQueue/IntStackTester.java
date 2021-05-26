package StackAndQueue;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	//최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / "
														 + s.capacity()); //max = capacity
			System.out.print("(1)푸시	(2)팝	(3)피크	(4)덤프\n"
						   + "(5)인덱스	(6)클리어	(7)용량	(8)현재 스택\n"
						   + "(9)빔?	(10)참?	(0)종료 : ");
			
			int menu = StdIn.nextInt();
			if (menu == 0) break;
			
			boolean y, z;
			int x;
			switch (menu) {	//switch-case구문
				case 1:		//푸시
					System.out.print("데이터: ");
					x = StdIn.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					System.out.println();
					break;
					
				case 2:		//팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					System.out.println();
					break;
					
				case 3:		//피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					System.out.println();
					break;
					
				case 4:		//덤프
					s.dump();
					System.out.println();
					break;
					
				case 5:		//인덱스
					System.out.print("인덱스 : ");
					x = StdIn.nextInt();
					int n = s.indexOf(x);
					if (n >= 0)
						System.out.println("현재 인덱스는 " + (s.size() - n) + "번에 있습니다.");
					else
						System.out.println("그런 데이터는 없습니다.");
					System.out.println();
					break;
					
				case 6:		//클리어
					s.clear();
					System.out.println("초기화되었습니다.");
					System.out.println();
					break;
					
				case 7:		//capacity
					x = s.capacity();
					System.out.println("현재 용량은 " + x + "입니다.");
					System.out.println();
					break;
					
				case 8:		//size
					x = s.size();
					System.out.println("현재 쌓인 스택은 " + x + "입니다.");
					System.out.println();
					break;
					
				case 9:		//isEmpty
					y = s.isEmpty();
					if (y == false)
						System.out.println("비어있지 않습니다.");
					else
						System.out.println("비어있습니다.");
					System.out.println();
					break;
					
				case 10:	//isFull
					z = s.isFull();
					if (z == true)
						System.out.println("가득 찼습니다.");
					else
						System.out.println("가득 차지 않았습니다.");
					System.out.println();
					break;
			}
		}
	}
}