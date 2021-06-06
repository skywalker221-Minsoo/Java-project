package Practice;

public class IponeTest {
	
	public IponeTest() {
		IphoneOrder use = new IphoneOrder(new IphoneUse());
		use.OrderIphone();
		
		IphoneUse use2 = new IphoneUse();
		use2.camera();
		use2.earplug();

	}
	// 이제 구현한 인터페이스와 implements했던 클래스들을 main에서 참조하여 사용.
	public static void main(String[] args) {

		new IponeTest();
	
	}

}
