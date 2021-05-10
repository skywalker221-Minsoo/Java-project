package Chap4;	//int�� ��

public class IntDQueue {
	private int max;	//�� �뷮
	private int front;	//�� �� Ŀ��
	private int rear;	//������ Ŀ��, �̰� �������� ��ĭ �ڸ� ����Ű�°� �ƴ�
	private int num;	//���� ������ ��
	private int[] que;	//ť ��ü
	
	//���� �� ����: ť�� ��� ����
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//���� �� ����: ť�� ���� ��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//������
	public IntDQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			//�� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {	//������ �� ����
			max = 0;
		}
	}
	
	//���� �����͸� �Ӹ��ʺ��� ��ť
	public int enqueFront(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//���� ���� ��
		num++;					//������ �� ����
		if (--front < 0)		//�������� �� �պ��� �־��ش�.
			front = max - 1;	//�ٵ� ���⼭ ���� ���� �� ���̸� �� �� �ڷΰ���?
		que[front] = x;			//����Ʈ�� 0�� �ƴϸ� �ε����� ����Ʈ�� ������ �Է¹��� ���� ����
		return x;
	}
	
	//���� �����͸� �����ʺ��� ��ť
	public int enqueRear(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//���� ���� ��
		que[rear++] = x;		//�����Ͱ� �������� ����� �� ���������� ����Ų��.
		num++;					//������ �� ����
		if (rear == max)		//�ڿ������� ���� �����Ͱ� �� ����
			rear = 0;			//����� ó���� ����Ų��.
		return x;
	}
	
	//���� �Ӹ����� �����͸� ��ť
	public int dequeFront() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//���� ��� ����.
		int x = que[front++];	//���� �� �պκ� ���� �ϳ��� ������������
		num--;					//���� �����Ͱ� �ϳ� ����������
		if (front == max)		//�����Ͱ� �� �������
			front = 0;			//����Ʈ�� 0
		return x;				//��ť�� ������
	}

	//���� ����� �����͸� ��ũ(���� �����͸� �鿩�ٺ�)
	public int dequeRear() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//���� ��� ����.
		//��ť���� �� ���� ��ǥ�� 0�̸� �ٽ� �� ������ ���� �ƴϸ� �� �� ������ ����� ���� ��ȯ.
		return que[rear == 0 ? max -1: rear -1];
	}
	
	//���� ����Ʈ���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	public int peekFront() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//ť�� �������.
		return que[front];
	}

	//������ x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == x)	//�˻� ����
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
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if(que[(i + front) % max] == x) //�˻� ����
				return i + 1;
		return 0;
	}
}
