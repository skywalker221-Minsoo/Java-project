package 배열응용;

public class 성적변동문제 {

	public static void main(String[] args) {
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		int count = 0;
		int same = 0;
		
		for (int i = 0; i < term1.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("성적이 향상된 학생 수는 " + count);
		for (int i = 0; i < term1.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
			}
		}
		System.out.println("성적이 동일한 학생 수는 " + same);
	}

}
