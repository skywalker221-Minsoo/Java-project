package pack02;

import java.util.Random; // �������� ���� �Ҵ��� �� �ֵ��� �ܺ� ���̺귯�� ���.

public class Test02 {

	public static void main(String[] args) {
		Random r = new Random(); // �������� ���� �Է¹����� �ְ� ���ش�.
		int[] num = new int[10]; // �ڸ��� 10���� int�� �迭 ����.
		int sum = 0; // �������� �����Ű�� ���� ���� �ʱ�ȭ.
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); // 0���� 99���� ���ڸ� ���Ƿ� ���� �� �ְ� ���ش�.
			System.out.print(num[i] + " "); // �������� �Է¹��� �� 10���� ������ ������ ���
			sum = sum + num[i]; // ���� �� ����
		}
		System.out.println();
		System.out.println(sum); // �������� ������ ���� 10���� �� ����.
		
		double d_num = (double)sum; // casting. ������ �Ǽ��� ��ȯ�Ͽ� �Ҽ������� ��µǵ��� �Ѵ�.
		System.out.println(d_num / 10);
	}

}
