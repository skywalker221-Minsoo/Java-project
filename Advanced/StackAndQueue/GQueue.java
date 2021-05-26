package StackAndQueue;	//int?�� ?��

public class GQueue<E> {
	private int max;	//?�� ?��?��
	private int front;	//첫번 ?��?�� 커서
	private int rear;	//마�?�? ?��?�� 커서, ?��?��?�� �? ?��?�� ?���? ?���? �?리킨?��.
	private int num;	//?��?�� ?��?��?�� ?��
	private E[] que;	//?�� 본체
	
	//?��?�� ?�� ?��?��: ?���? 비어 ?��?��
	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//?��?�� ?�� ?��?��: ?���? �??�� �?
	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//?��?��?��
	public GQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) new Object[max];			//?�� 본체?�� 배열?�� ?��?��
		} catch (OutOfMemoryError e) {	//?��?��?�� ?�� ?��?��
			max = 0;
		}
	}
	
	//?��?�� ?��?��?���? ?��?��
	public E enque(E x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//?���? �??�� �?
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	//?��?��?�� ?��?��?���? ?��?��
	public E deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	//?��?��?�� ?��?��?���? ?��?��(?��?��?�� ?��?��?���? ?��?��?���?)
	public E peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//?���? 비어?��?��.
		return que[front];
	}
	
	//?��?��?�� x�? �??��?��?�� ?��?��?��(찾�? 못하�? -1)�? 반환
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			if (que[i + front] == x)	//�??�� ?���?
				return i + front;
		}
		return -1;				//�??�� ?��?��
	}
	
	//?���? 비�?
	public void clear() {
		num = front = rear = 0;
	}
	
	//?��?�� ?��?��?�� 반환
	public int capacity() {
		return max;
	}
	
	//?��?�� ?��?�� ?��?�� ?��?��?�� ?���? 반환
	public int size() {
		return num;
	}
	
	//?���? 비어 ?��?��?��?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//?���? �??�� 찼나?��?
	public boolean isFull() {
		return num >= max;
	}
	
	//?�� ?��?�� 모든 ?��?��?���? ?��?��?�� > 리어 ?��?���? 출력
	public void dump() {
		if (num <= 0)
			System.out.println("?���? 비어 ?��?��?��?��.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
	//?��?��?�� x�? �??��?��?�� 머리�??�� 몇번째인�?? 찾�? 못하�? 0 반환
	public int search(E x) {
		for (int i = 0; i < num; i++)
			if(que[(i + front) % max].equals(x)) //�??�� ?���?
				return i + 1;
		return 0;
	}
}