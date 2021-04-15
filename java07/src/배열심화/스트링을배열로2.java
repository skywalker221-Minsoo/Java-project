package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꾸기
		String[] s = all.split(",");
		System.out.println(s[0] + s[1] + s[2] + s[3]);
		//2. 공백이 포함되어 있다면, 공백 제거 후 다시 넣기
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].trim();
		}
		System.out.println(s[0] + s[1] + s[2] + s[3]);
		//3. 과목 수
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			count++;
		}
		System.out.println(count);
		//4. 컴퓨터의 위치
		for (int i = 0; i < s.length; i++) {
			if ( s[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}
		
		//5. 과목명이 3글자 미만인 과목?
		int count3 = 0;
		for (int j = 0; j < s.length; j++) {
//			String a = s[j];
//			char[] s2 = a.toCharArray();
//			int count2 = 0;
//			
//			for (int i = 0; i < s2.length; i++) {
//				count2++;
//			}
//			if (count2 < 3) {
//				count3++;
			if (s[j].length() < 3) {
				count3++;
			}
		}
		System.out.println(count3);

		
	}

}
