package 클래스만들기;

public class TV {
	// void : 없다! 반환값이 없다. return은 void에 쓰면 안된다!!!
	// 클래스이름을 대문자로 시작해야 한다.
	// 낙타표기법을 지켜야 한다.
	// => 멤버변수(멤버변수는 선언만 해준다!)
	String color; // 참조형은 무조건 null로 초기화
	int size; // 기본형은 0으로 초기화
	
	public void on() {
		System.out.println("TV를 켜다.");
	}
	
	public void off() {
		System.out.println("TV를 끄다.");
	}
	
	public void ch() {
		System.out.println("TV채널을 바꾸다.");
	}
	
}
