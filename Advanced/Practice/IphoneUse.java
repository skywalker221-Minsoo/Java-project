package Practice;

public class IphoneUse implements IphoneInterface {
	
	@Override
	public void earplug() {
		System.out.println("이어플러그를 사용합니다.");
	}
	
	@Override
	public void camera() {
		System.out.println("카메라를 사용합니다.");
	}
}
