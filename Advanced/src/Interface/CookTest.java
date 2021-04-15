package Interface;

public class CookTest {
	
	public CookTest() {
		CookManager cm = new CookManager(new ChineseCook());
		cm.orderRice();
		cm.orderSoup();
		
		cm.setIcook(new KoreanCook());
		
		cm.orderRice();
		cm.orderSoup();
	}
	// ���� ������ �������̽��� implements�ߴ� Ŭ�������� main���� �����Ͽ� ���.
	public static void main(String[] args) {

		new CookTest();
		//KoreanCook ks = new KoreanCook();
		//ks.makeRice();
		//ks.makeSalad();
		//ks.makeSoup();
		//ks.makeSource();

		//ChineseCook cs = new ChineseCook();
		//cs.makeRice();

		// ��� Ȥ�� �������̽��� ��üȭ�� Ŭ�������� ���������� �����ؼ� ��� ����.
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
