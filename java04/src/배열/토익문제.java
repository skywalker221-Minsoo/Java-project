package 배열;

public class 토익문제 {

	public static void main(String[] args) {
//		int[] 정답 = new int[999];
//		int[] 내답 = new int[999];

		int[] num = new int[5];
		//배열에 데이터를 넣거나, 꺼내거나, 위치값을 알고 싶거나		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1 + " : " + num[i]);
		}
		
		//알아서 인덱스 0부터 시작해서 끝까지 1씩 증가하면서 하나씩 꺼내오기.
		//for-each // 배열에서 순서대로 꺼내어 특정한 처리
		for (int i : num) {
			System.out.println(i);
		}
		
	}

}
