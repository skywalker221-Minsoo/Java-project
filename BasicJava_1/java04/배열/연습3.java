package 배열;

public class 연습3 {
	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = i * 2;
		}
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + "\t"); // \t 는 일정한 간격만큼 띄우기
		}
	}
}
