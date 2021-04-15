package java09;

public class 폰을만들어사용해보자 {

	public static void main(String[] args) {
		Phone ph1 = new Phone();
		Phone ph2 = new Phone();
		
		ph1.color = "다크그레이";
		ph2.color = "프리즘화이트";
		
		ph1.com = "애플";
		ph2.com = "삼성";
		
		ph1.made();
		ph2.made();
		
		ph1.num();
		ph2.num();
		ph1.text("철수", "굿모닝", 10);
		
		ph1.internet("네이버", "어제", 10);
	}

}
