package 배열심화;

public class 깊은복사연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = {"국어", "수학", "영어", "과학", "컴퓨터"};
		int[] term1 = {100, 90, 70, 30, 50};
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		int count = 0;
		
		System.out.println(title[0] + " " + title[1] + " " + title[2] + " " + title[3] + " " + title[4]);
		System.out.println("1학기 성적");
		for (int i : term1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("2학기 성적");
		for (int i : term2) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count++;
			}
		}
		System.out.println();
		System.out.println("향상된 과목 수 : " + count);
	}
}
