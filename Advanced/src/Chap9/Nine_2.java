package Chap9;
import java.util.Comparator;

public class Nine_2<E> {
	//���
	class Node<E> {
		E data;			//������
		Node<E> next;	//���� ������(���� ��� ����)
		
		//������
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head;	//�Ӹ����
	private Node<E> crnt;	//���ó��

	
	//������
	public Nine_2() {
		head = crnt = null;
	}
	
	//��� �˻�
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;	//���� ��ĵ ���� ���
		
		while (ptr != null) {
			if (c.compare(obj, ptr.data) == 0) {	//�˻� ����
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;	//���� ��� ����
		}
		return null;		//�˻� ����
	}
	
	//�Ӹ��� ��� ����
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
	}
	
	//������ ��� ����
	public void addLast(E obj) {
		if (head == null)
			addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	//�Ӹ� ��带 ����
	public void removeFirst() {
		if (head != null)			//����Ʈ�� ��� ���� ������
			head = crnt = head.next;
	}
	
	//���� ��带 ����
	public void removeLast() {
		if (head != null) {
			if (head.next == null)	//��尡 �ϳ��� ������
				removeFirst();		//�Ӹ� ��带 ����
			else {
				Node<E> ptr = head;	//��ĵ ���� ���
				Node<E> pre = head;	//��ĵ ���� ����� ���� ���
				
				while (ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null;	//pre�� ���� ���� ���� ���
				crnt = pre;
			}
		}
	}
	
	//��� p�� ����
	public void remove(Node p) {
		if (head != null ) {
			if (p == head)			//p�� �Ӹ� ����
				removeFirst();		//�Ӹ� ��带 ����
			else {
				Node<E> ptr = head;
				
				while (ptr.next != p) {
					ptr = ptr.next;
					if (ptr == null) return;	//p�� ����Ʈ�� �����ϴ�.
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	//���� ��带 ����
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	//��� ��带 ����
	public void clear() {
		while (head != null)	//��忡 �ƹ��͵� ���� ������
			removeFirst();		//�Ӹ� ��带 ����
		crnt = null;		
	}
	
	//���� ��带 �ϳ� �������� �̵�
	public boolean next() {
		if (crnt == null || crnt.next == null)
			return false;
		crnt = crnt.next;
		return true;
	}
	
	public void printCurrentNode() {
		if (crnt == null)
			System.out.println("������ ��尡 �����ϴ�.");
		else
			System.out.println(crnt.data);
	}
	
	//��� ��带 ���
	public void dump() {
		Node<E> ptr = head;
		
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}



