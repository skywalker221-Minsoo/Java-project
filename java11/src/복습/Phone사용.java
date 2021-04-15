package 복습;

public class Phone사용 {

	public static void main(String[] args) {
		Phone p1 = new Phone("빨강", 7);
		//p1.color = "빨강";
		//p1.size = 7;
		p1.text();
		System.out.println(p1);

		Phone p2 = new Phone("검정", 11);
		//p2.color = "검정";
		//p2.size = 11;
		p2.internet();
		System.out.println(p2);
	}
}
