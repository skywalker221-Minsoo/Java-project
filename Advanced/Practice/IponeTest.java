package Practice;

public class IponeTest {
	
	public IponeTest() {
		IphoneOrder use = new IphoneOrder(new IphoneUse());
		use.OrderIphone();
		
		IphoneUse use2 = new IphoneUse();
		use2.camera();
		use2.earplug();

	}
	// ���� ������ �������̽��� implements�ߴ� Ŭ�������� main���� �����Ͽ� ���.
	public static void main(String[] args) {

		new IponeTest();
	
	}

}
