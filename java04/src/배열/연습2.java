package 배열;

public class 연습2 {

	public static void main(String[] args) {
		String[] gul = new String[3];
		String total = "자바,스프링,JSP"; // 여러개 넣고싶으면 한꺼번에
		String[] result = total.split(","); // 이후 split으로 쪼개주자.
		for (int i = 0; i < result.length; i++) {
			gul[i] = result[i];
			System.out.println(gul[i]);
		}
//		gul[0] = "자바";
//		gul[1] = "스프링";
//		gul[2] = "JSP";
//		System.out.println(gul[0] + " 보다는 " + gul[1]);
//		for (int j = 0; j < gul.length; j++) {
//			System.out.println(gul[j]);
//		}
	}

}
