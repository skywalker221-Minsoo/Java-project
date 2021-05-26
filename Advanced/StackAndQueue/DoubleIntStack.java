package StackAndQueue;	//int형 스택

import javax.management.RuntimeErrorException;

public class DoubleIntStack {

	private int max;	//스택 용량
	private int ptr1;	//스택 포인터
	private int ptr2;	//스택 포인터
	private int[] stk;	//스택 본체
	
	public enum AorB {
		StackA, StackB
	}
	
	//실행시 예외: 스택이 비어 있음
	public class EmptyIntStackX2Exception extends RuntimeException {
		public EmptyIntStackX2Exception() {}
	}
	
	//실행시 예외: 스택이 가득 참
	public class OverflowIntStackX2Exception extends RuntimeException {
		public OverflowIntStackX2Exception() {}
	}
	
	//생성자
	public DoubleIntStack(int capacity) {
		ptr1 = 0;				//바닥에서부터 가운데로 쌓인다.
		ptr2 = capacity - 1;	//꼭대기에서부터 가운데로 쌓인다.
		max = capacity;
		try {
			stk = new int[max];			//스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(AorB sw, int x) throws OverflowIntStackX2Exception {
		if (ptr1 >= ptr2 + 1)	//공통으로 쓰니까 ptr1 과 ptr2에 1이 더해지면 max
			throw new OverflowIntStackX2Exception();
		switch (sw) {	//ptr1과 ptr2을 사용할때 들어가는 위치는 서로 가운데를 향하여 쌓임 
		case StackA:
			stk[ptr1++] = x;
			break;
			
		case StackB:
			stk[ptr2--] = x;
			break;
		}
		return x;
	}
	
	//스택에서 데이터를 팝(각자 위치에서 가장 늦게 들어온 데이터를 꺼냄)
	public int pop(AorB sw) throws EmptyIntStackX2Exception {
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptr1 <= 0)
				throw new OverflowIntStackX2Exception();
			 x = stk[--ptr1];
			 break;
			 
		case StackB:
			if (ptr2 >= max - 1)
				throw new OverflowIntStackX2Exception();
			 x = stk[++ptr2];
			 break;
		}
		return x;
	}
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek(AorB sw) throws EmptyIntStackX2Exception {
		int x = 0;
		switch (sw) {
		case StackA:
			if (ptr1 <= 0)
				throw new EmptyIntStackX2Exception();
			x = stk[ptr1 - 1];
			break;
			
		case StackB:
			if (ptr2 >= max - 1)
				throw new EmptyIntStackX2Exception();
			x = stk[ptr2 + 1];
			break;
		}
		return x;
	}
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(AorB sw, int x) {
		switch (sw) {
		case StackA:
			for (int i = ptr1 - 1; i >= 0; i--)	//정상(바닥) 쪽에서 선형 검색
				if (stk[i] == x)
					return i;
			break;
		
		case StackB:
			for (int i = ptr2 + 1; i < max; i++)	//정상(천장) 쪽에서 선형 검색
				if (stk[i] == x)
					return i;
			break;
		}
		return -1;	
	}
	
	//스택을 비움
	public void clear(AorB sw) {
		switch (sw) {
		case StackA:
			ptr1 = 0;
			break;
		case StackB:
			ptr2 = max - 1;
			break;
		}
		
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여 있는 데이터 수를 반환
	public int size(AorB sw) {
		switch (sw) {
		case StackA:
			return ptr1;	//바닥에서부터 쌓이니까 그대로 포인터 가져옴.
		case StackB:
			return max - 1 - ptr2;	//천장에서부터 쌓이니까 천장 - 쌓여온 스택
		}
		return 0;	//두 경우가 아니면 초기화(무쓸모)
	}
	
	//스택이 비어 있는지?
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		case StackA:
			return ptr1 <= 0;
		case StackB:
			return ptr2 >= max - 1;	
		}
		return true;
	}
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr1 >= ptr2 + 1;
	}
	
	//스택 안의 모든 데이터를 바닥에서 꼭대기 순서로 출력
	public void dump(AorB sw) {
		switch (sw) {
		case StackA:
			if (ptr1 <= 0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = 0; i < ptr1; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptr2 >= max - 1)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = max - 1; i > ptr2; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}			
	}
}