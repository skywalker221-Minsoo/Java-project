package StackAndQueue;	//int?˜• ?

public class IntQueue {
	private int max;	//? ?š©?Ÿ‰
	private int front;	//ì²«ë²ˆÂŠ ?š”?†Œ ì»¤ì„œ
	private int rear;	//ë§ˆì?ë§? ?š”?†Œ ì»¤ì„œ, ?°?´?„° ë§? ?’¤?˜ ?•œì¹? ?’¤ë¥? ê°?ë¦¬í‚¨?‹¤.
	private int num;	//?˜„?¬ ?°?´?„° ?ˆ˜
	private int[] que;	//? ë³¸ì²´
	
	//?‹¤?–‰ ?‹œ ?˜ˆ?™¸: ?ê°? ë¹„ì–´ ?ˆ?Œ
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//?‹¤?–‰ ?‹œ ?˜ˆ?™¸: ?ê°? ê°??“ ì°?
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//?ƒ?„±?
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			//? ë³¸ì²´?š© ë°°ì—´?„ ?ƒ?„±
		} catch (OutOfMemoryError e) {	//?ƒ?„±?•  ?ˆ˜ ?—†?Œ
			max = 0;
		}
	}
	
	//??— ?°?´?„°ë¥? ?¸?
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//?ê°? ê°??“ ì°?
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	//??—?„œ ?°?´?„°ë¥? ?””?
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	//??—?„œ ?°?´?„°ë¥? ?”¼?¬(?”„?Ÿ°?Š¸ ?°?´?„°ë¥? ?“¤?—¬?‹¤ë´?)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//?ê°? ë¹„ì–´?ˆ?Œ.
		return que[front];
	}
	
	//??—?„œ xë¥? ê²??ƒ‰?•˜?—¬ ?¸?±?Š¤(ì°¾ì? ëª»í•˜ë©? -1)ë¥? ë°˜í™˜
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x)	//ê²??ƒ‰ ?„±ê³?
				return idx;
		}
		return -1;				//ê²??ƒ‰ ?‹¤?Œ¨
	}
	
	//?ë¥? ë¹„ì?
	public void clear() {
		num = front = rear = 0;
	}
	
	//??˜ ?š©?Ÿ‰?„ ë°˜í™˜
	public int capacity() {
		return max;
	}
	
	//??— ?Œ“?—¬ ?ˆ?Š” ?°?´?„° ?ˆ˜ë¥? ë°˜í™˜
	public int size() {
		return num;
	}
	
	//?ê°? ë¹„ì–´ ?ˆ?‚˜?š”?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//?ê°? ê°??“ ì°¼ë‚˜?š”?
	public boolean isFull() {
		return num >= max;
	}
	
	//? ?•ˆ?˜ ëª¨ë“  ?°?´?„°ë¥? ?”„?Ÿ°?Š¸ > ë¦¬ì–´ ?ˆœ?œ¼ë¡? ì¶œë ¥
	public void dump() {
		if (num <= 0)
			System.out.println("?ê°? ë¹„ì–´ ?ˆ?Šµ?‹ˆ?‹¤.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
	//??—?„œ xë¥? ê²??ƒ‰?•˜?—¬ ë¨¸ë¦¬ë¶??„° ëª‡ë²ˆì§¸ì¸ê°?? ì°¾ì? ëª»í•˜ë©? 0 ë°˜í™˜
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if(que[(i + front) % max] == x) //ê²??ƒ‰ ?„±ê³?
				return i + 1;
		return 0;
	}
}