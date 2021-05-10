package Chap4;	//���ʸ��� ����, �ʿ信 ���� �������� �ʿ��� �� � ���·ε� ����Ҽ� �ִ�. 

public class Gstack<E> {

	private int max;	//���� �뷮
	private int ptr;	//���� ������
	private E[] stk;	//���� ��ü
	
	//����� ����: ������ ��� ����
	public static class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//����� ����: ������ ���� ��
	public static class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//������
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];	//���� ��ü�� �迭�� ����, ���ʸ� 
		} catch (OutOfMemoryError e) {	//������ �� ����
			max = 0;
		}
	}
	
	//���ÿ� x�� Ǫ��
	public E push(E x) throws OverflowIntStackException {
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public E pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new OverflowIntStackException();
		return stk[--ptr];
	}
	
	//���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
	public E peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	//���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(E x) {	//���ʸ� ������ x�� ����
		for (int i = ptr - 1; i >= 0; i--)	//���� �ʿ��� ���� �˻�
			//�ּҰ��� ��(==) �ϴ°� �ƴ϶� �����Ͱ��� ��(.equals)�� � ���°� �͵� ���Ҽ��ְ���.
			if (stk[i].equals(x))
				return i;
		return -1;	
	}
	
	//������ ���
	public void clear() {
		ptr = 0;
	}
	
	//������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}
	
	//������ ��� �ִ���?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//������ ���� á�°�?
	public boolean isFull() {
		return ptr >= max;
	}
	
	//���� ���� ��� �����͸� �ٴڿ��� ����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
