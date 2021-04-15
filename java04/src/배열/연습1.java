package 배열;

public class 연습1 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int l = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
		System.out.println(num[0] + num[2]);
	}

}
