package pack02;

public class Test01 {

	public static void main(String[] args) {
		int[] num = new int[1000]; // ���� �ڸ��� 1000���� int�� �迭 ����. ��� �ڸ��� ���� 0���� �ʱ�ȭ.
		
		num[0] = 100; // ù��° �ڸ��� ���� 0�� 100���� ��ü.
		num[4] = 200; // �ټ����� �ڸ��� ���� 0�� 200���� ��ü.
		num[9] = 300; // ����° �ڸ��� ���� 0�� 300���� ��ü
		num[999] = 500; // ������ �ڸ��� ���� 0�� 500���� ��ü.
		int count = 0; // �迭�� ����ִ� ������ ������ ���� ���� ���� �ʱ�ȭ.
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				count++; // �迭�� ����ִ� ���� ����� ���� �ش�.
			}
		}
		System.out.println("�迭�� ����ִ� ������ ���� : " + count);
		System.out.println("1��° ��ġ: " + num[0]);
		System.out.println("5��° ��ġ: " + num[4]);
		System.out.println("10��° ��ġ: " + num[9]);
		System.out.println("1000��° ��ġ: " + num[999]);
	}

}
