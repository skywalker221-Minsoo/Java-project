package Chap4;	//int�� ����

import javax.management.RuntimeErrorException;

public class DoubleIntStack {

	private int max;	//���� �뷮
	private int ptr1;	//���� ������
	private int ptr2;	//���� ������
	private int[] stk;	//���� ��ü
	
	public enum AorB {
		StackA, StackB
	}
	
	//����� ����: ������ ��� ����
	public class EmptyIntStackX2Exception extends RuntimeException {
		public EmptyIntStackX2Exception() {}
	}
	
	//����� ����: ������ ���� ��
	public class OverflowIntStackX2Exception extends RuntimeException {
		public OverflowIntStackX2Exception() {}
	}
	
	//������
	public DoubleIntStack(int capacity) {
		ptr1 = 0;				//�ٴڿ������� ����� ���δ�.
		ptr2 = capacity - 1;	//����⿡������ ����� ���δ�.
		max = capacity;
		try {
			stk = new int[max];			//���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {	//������ �� ����
			max = 0;
		}
	}
	
	//���ÿ� x�� Ǫ��
	public int push(AorB sw, int x) throws OverflowIntStackX2Exception {
		if (ptr1 >= ptr2 + 1)	//�������� ���ϱ� ptr1 �� ptr2�� 1�� �������� max
			throw new OverflowIntStackX2Exception();
		switch (sw) {	//ptr1�� ptr2�� ����Ҷ� ���� ��ġ�� ���� ����� ���Ͽ� ���� 
		case StackA:
			stk[ptr1++] = x;
			break;
			
		case StackB:
			stk[ptr2--] = x;
			break;
		}
		return x;
	}
	
	//���ÿ��� �����͸� ��(���� ��ġ���� ���� �ʰ� ���� �����͸� ����)
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
	
	//���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
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
	
	//���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(AorB sw, int x) {
		switch (sw) {
		case StackA:
			for (int i = ptr1 - 1; i >= 0; i--)	//����(�ٴ�) �ʿ��� ���� �˻�
				if (stk[i] == x)
					return i;
			break;
		
		case StackB:
			for (int i = ptr2 + 1; i < max; i++)	//����(õ��) �ʿ��� ���� �˻�
				if (stk[i] == x)
					return i;
			break;
		}
		return -1;	
	}
	
	//������ ���
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
	
	//������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int size(AorB sw) {
		switch (sw) {
		case StackA:
			return ptr1;	//�ٴڿ������� ���̴ϱ� �״�� ������ ������.
		case StackB:
			return max - 1 - ptr2;	//õ�忡������ ���̴ϱ� õ�� - �׿��� ����
		}
		return 0;	//�� ��찡 �ƴϸ� �ʱ�ȭ(������)
	}
	
	//������ ��� �ִ���?
	public boolean isEmpty(AorB sw) {
		switch (sw) {
		case StackA:
			return ptr1 <= 0;
		case StackB:
			return ptr2 >= max - 1;	
		}
		return true;
	}
	
	//������ ���� á�°�?
	public boolean isFull() {
		return ptr1 >= ptr2 + 1;
	}
	
	//���� ���� ��� �����͸� �ٴڿ��� ����� ������ ���
	public void dump(AorB sw) {
		switch (sw) {
		case StackA:
			if (ptr1 <= 0)
				System.out.println("������ ��� �ֽ��ϴ�.");
			else {
				for (int i = 0; i < ptr1; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptr2 >= max - 1)
				System.out.println("������ ��� �ֽ��ϴ�.");
			else {
				for (int i = max - 1; i > ptr2; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}			
	}
}