package 배열심화;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); // 괄호 안에 있는거 기준으로 쪼개서 배열에 넣어준다.
		int count = 0; 
		for (int i = 0; i < s2.length; i++) {
			count++;
		}
		System.out.println("음식의 갯수 : " + count);
		
		String s3 = "          홍길동";
		String s4 = s3.trim(); // 공백을 없앤다.
		System.out.println(s4);
		
		String s5 = s3.replace("          ", ""); // 앞에 있는 것을 뒤에 있는것으로 대체
		System.out.println(s5);
		String s6 = "홍길동";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
