package 상속;

public class 맨 extends 사람 {
	//extends: 확장하다
	//사람클래스를 확장해서 맨을 만들겠다.
	//멤버변수 2, 멤버메서드 1 (사람)
	int speed;
	
	public void 달리다() {
		System.out.println("빨리 달리다");
	}
}
