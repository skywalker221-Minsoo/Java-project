package Chap4;	//int�� ť

public class GQueue<E> {
	private int max;	//ť �뷮
	private int front;	//ù���� ��� Ŀ��
	private int rear;	//������ ��� Ŀ��, ������ �� ���� ��ĭ �ڸ� ����Ų��.
	private int num;	//���� ������ ��
	private E[] que;	//ť ��ü
	
	//���� �� ����: ť�� ��� ����
	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//���� �� ����: ť�� ���� ��
	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public GQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];			//ť ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {	//������ �� ����
			max = 0;
		}
	}
	
	//ť�� �����͸� ��ť
	public E enque(E x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//ť�� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	//ť���� �����͸� ��ť
	public E deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	//ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public E peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//ť�� �������.
		return que[front];
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			if (que[i + front] == x)	//�˻� ����
				return i + front;
		}
		return -1;				//�˻� ����
	}
	
	//ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	//ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}
	
	//ť ���� ��� �����͸� ����Ʈ > ���� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
	//ť���� x�� �˻��Ͽ� �Ӹ����� ���°�ΰ�? ã�� ���ϸ� 0 ��ȯ
	public int search(E x) {
		for (int i = 0; i < num; i++)
			if(que[(i + front) % max].equals(x)) //�˻� ����
				return i + 1;
		return 0;
	}
}
