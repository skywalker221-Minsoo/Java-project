package StackAndQueue;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	//�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / "
														 + s.capacity()); //max = capacity
			System.out.print("(1)Ǫ��	(2)��	(3)��ũ	(4)����\n"
						   + "(5)�ε���	(6)Ŭ����	(7)�뷮	(8)���� ����\n"
						   + "(9)��?	(10)��?	(0)���� : ");
			
			int menu = StdIn.nextInt();
			if (menu == 0) break;
			
			boolean y, z;
			int x;
			switch (menu) {	//switch-case����
				case 1:		//Ǫ��
					System.out.print("������: ");
					x = StdIn.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("������ ���� á���ϴ�.");
					}
					System.out.println();
					break;
					
				case 2:		//��
					try {
						x = s.pop();
						System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					System.out.println();
					break;
					
				case 3:		//��ũ
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					System.out.println();
					break;
					
				case 4:		//����
					s.dump();
					System.out.println();
					break;
					
				case 5:		//�ε���
					System.out.print("�ε��� : ");
					x = StdIn.nextInt();
					int n = s.indexOf(x);
					if (n >= 0)
						System.out.println("���� �ε����� " + (s.size() - n) + "���� �ֽ��ϴ�.");
					else
						System.out.println("�׷� �����ʹ� �����ϴ�.");
					System.out.println();
					break;
					
				case 6:		//Ŭ����
					s.clear();
					System.out.println("�ʱ�ȭ�Ǿ����ϴ�.");
					System.out.println();
					break;
					
				case 7:		//capacity
					x = s.capacity();
					System.out.println("���� �뷮�� " + x + "�Դϴ�.");
					System.out.println();
					break;
					
				case 8:		//size
					x = s.size();
					System.out.println("���� ���� ������ " + x + "�Դϴ�.");
					System.out.println();
					break;
					
				case 9:		//isEmpty
					y = s.isEmpty();
					if (y == false)
						System.out.println("������� �ʽ��ϴ�.");
					else
						System.out.println("����ֽ��ϴ�.");
					System.out.println();
					break;
					
				case 10:	//isFull
					z = s.isFull();
					if (z == true)
						System.out.println("���� á���ϴ�.");
					else
						System.out.println("���� ���� �ʾҽ��ϴ�.");
					System.out.println();
					break;
			}
		}
	}
}