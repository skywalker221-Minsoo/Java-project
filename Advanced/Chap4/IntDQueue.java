package Chap4;	//int형 덱

public class IntDQueue {
	private int max;	//덱 용량
	private int front;	//맨 앞 커서
	private int rear;	//마지막 커서, 이건 마지막의 한칸 뒤를 가리키는게 아님
	private int num;	//현재 데이터 수
	private int[] que;	//큐 본체
	
	//실행 시 예외: 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외: 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public IntDQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			//덱 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}
	
	//덱의 데이터를 머리쪽부터 인큐
	public int enqueFront(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//덱이 가득 참
		num++;					//데이터 수 증가
		if (--front < 0)		//데이터의 맨 앞부터 넣어준다.
			front = max - 1;	//근데 여기서 만약 덱의 맨 앞이면 왜 맨 뒤로가지?
		que[front] = x;			//프런트가 0이 아니면 인덱스가 프런트인 공간에 입력받은 변수 저장
		return x;
	}
	
	//덱의 데이터를 꼬리쪽부터 인큐
	public int enqueRear(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();	//덱이 가득 참
		que[rear++] = x;		//데이터가 들어왔으니 레어는 그 다음공간을 가리킨다.
		num++;					//데이터 수 증가
		if (rear == max)		//뒤에서부터 들어가는 데이터가 꽉 차면
			rear = 0;			//레어는 처음을 가리킨다.
		return x;
	}
	
	//덱의 머리부터 데이터를 디큐
	public int dequeFront() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//덱이 비어 있음.
		int x = que[front++];	//덱의 맨 앞부분 공간 하나가 빠져나갔으니
		num--;					//현재 데이터가 하나 빠져나갔고
		if (front == max)		//데이터가 다 비워지면
			front = 0;			//프런트는 0
		return x;				//디큐된 데이터
	}

	//덱의 레어에서 데이터를 피크(레어 데이터를 들여다봄)
	public int dequeRear() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//덱이 비어 있음.
		//디큐했을 때 레어 좌표가 0이면 다시 맨 끝으로 가고 아니면 맨 뒤 공간에 저장된 정보 반환.
		return que[rear == 0 ? max -1: rear -1];
	}
	
	//덱의 프론트에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peekFront() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();	//큐가 비어있음.
		return que[front];
	}

	//덱에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			if (que[(i + front) % max] == x)	//검색 성공
				return i + front;
		}
		return -1;				//검색 실패
	}
		
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	//큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}
	
	//큐 안의 모든 데이터를 프런트 > 레어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
	//큐에서 x를 검색하여 머리부터 몇번째인가? 찾지 못하면 0 반환
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if(que[(i + front) % max] == x) //검색 성공
				return i + 1;
		return 0;
	}
}
