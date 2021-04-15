package com.mega.mvc3333;

public class CookTest {
	
	public CookTest() {
		CookManager cm = new CookManager(new ChineseCook());
		cm.orderRice();
		cm.orderSoup();
		
		cm.setIcook(new KoreanCook());
		
		cm.orderRice();
		cm.orderSoup();
	}
	// 이제 구현한 인터페이스와 implements했던 클래스들을 main에서 참조하여 사용.
	public static void main(String[] args) {

		new CookTest();
		//KoreanCook ks = new KoreanCook();
		//ks.makeRice();
		//ks.makeSalad();
		//ks.makeSoup();
		//ks.makeSource();

		//ChineseCook cs = new ChineseCook();
		//cs.makeRice();

		// 상수 혹은 인터페이스를 실체화한 클래스들을 선택적으로 참조해서 사용 가능.
		//CookManager cm1 = new CookManager(null);
		//CookManager cm2 = new CookManager(cs);
		//cm1.orderRice();
		//cm1.setIcook(null);
		//cm1.setIcook(cs);
		//cm1.setIcook(ks);
		//cm2.setIcook(null);
		//cm2.setIcook(cs);
		//cm2.setIcook(ks);
		
		
	}

}
