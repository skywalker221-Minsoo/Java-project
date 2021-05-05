package Chap9;
import java.util.Comparator;
//���� ���� ���� ����Ʈ Ŭ����

public class Chap9_4<E> {	//DblLinkedList
	//���
	class Node<E> {
		private E data;
		private Node<E> prev;
		private Node<E> next;
		
		//������
		Node() {
			data = null;
			prev = next = this;
		}
		
		//������
		Node(E obj, Node<E> prev, Node<E> next) {
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head;
	private Node<E> crnt;
	
	//������
	public Chap9_4() {
		head = crnt = new Node<E>();	//���� ��带 ����
	}
	
	//����Ʈ�� ��� �ִ°�?
	public boolean isEmpty() {
		return head.next == head;
	}

	//��带 �˻�
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head.next;		//���� ��ĵ ���� ���
		
		while (ptr != head) {
			if (c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;		//�˻� ����
			}
			ptr = ptr.next;				//���� ���� ����
		}
		return null;					//�˻� ����
	}
	
	//���� ��带 ���
	public void printCurrentNode() {
		if (isEmpty())
			System.out.println("���� ��尡 �����ϴ�.");
		else
			System.out.println(crnt.data);
	}
	
	//��� ��带 ���
	public void dump() {
		Node<E> ptr = head.next;		//���� ����� ���� ���
		
		while (ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	//��� ��带 �Ųٷ� ���
	public void dumpReverse() {
		Node<E> ptr = head.prev;		//���� ����� ���� ���
		
		while (ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	//���� ��带 �ϳ� �������� �̵�
	public boolean next() {
		if (isEmpty() || crnt.next == head)
			return false;				//�̵��� �� ����
		crnt = crnt.next;
		return true;
	}
	
	//���� ��带 �ϳ� �������� �̵�
	public boolean prev() {
		if (isEmpty() || crnt.prev == head)
			return false;				//�̵��� �� ����
		crnt = crnt.prev;
		return true;
	}
	
	//���� ����� �ٷ� �ڿ� ��带 ����
	public void add(E obj) {
		Node<E> node = new Node<E>(obj, crnt, crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}
	
	//�Ӹ��� ��带 ����
	public void addFirst(E obj) {
		crnt = head;					//���� ��� head�� �ٷ� �ڿ� ����
		add(obj);
	}
	
	//������ ��带 ����
	public void addLast(E obj) {
		crnt = head.prev;
		add(obj);						//���� ��� head.prev�� �ٷ� �ڿ� ����
	}
	
	//���� ��带 ����
	public void removeCurrentNode() {
		if (!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if (crnt == head) crnt = head.next;
		}
	}
	
	//��� p�� ����
	public void remove(Node p) {
		Node<E> ptr = head.next;
		
		while (ptr != head) {
			if (ptr == p) {
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	//�Ӹ� ��带 ����
	public void removeFirst() {
		crnt = head.next;			//�Ӹ� ��� head.next�� ����
		removeCurrentNode();
	}
	
	//���� ��带 ����
	public void removeLast() {
		crnt = head.prev;			//���� ��� head.prev�� ����
		removeCurrentNode();
	}
	
	//��� ��带 ����
	public void clear() {
		while (!isEmpty())			//�� �� ������
			removeFirst();			//�Ӹ� ��带 ����
	}
}