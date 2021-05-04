package 상속;

public class 수퍼맨 extends 맨 {
	//멤버변수 3, 멤버메서드 2 (사람 : 2,1 맨 : 1,1)
	boolean fly;
	
	public void 우주를날다() {
		System.out.println("이름이 " + name + "가 지구 밖인 우주를 날다.");

	}

	@Override //상속받았던 메서드 중에서 메서드의 기능을 재정의해서 사용할 수 있다.
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
}
