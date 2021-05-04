package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		계좌 draw = new 계좌();
		계좌 draw2 = new 계좌();
		계좌 draw3 = new 계좌();
		
		System.out.println(draw.name);
		System.out.println(draw.withdraw);
		System.out.println(draw.money);
		
		draw.예금하다("이순신", "국민카드", 50000);
		draw.예금하다("홍길동", 50000);
		draw.출금하다(50000);
		
		draw2.예금하다("김두한", "신한카드", 70000);
		draw2.예금하다("김두한", 70000);
		draw2.출금하다(70000);
		
		draw3.예금하다("강백호", "하나카드", 40000);
		draw3.예금하다("강백호", 40000);
		draw3.출금하다(40000);
	}
}
