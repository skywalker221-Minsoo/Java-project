package 클래스만들기;

public class 전화기 {
	// 함수 정의 => 이 부품이 처리해야할 기능을 정의
	public void 전화하다() {
		//void : 없다! 반환값이 없다. return은 void에 쓰면 안된다!!!
		System.out.println("전화기로 전화하다.");
	}
	
	public void 문자하다() {
		System.out.println("전화기로 문자하다.");
	}
	
	public void 카톡하다() {
		System.out.println("전화기로 카톡하다.");
	}
	
	public void 인터넷하다() {
		System.out.println("전화기로 인터네셍 접속하다.");
	}
}
