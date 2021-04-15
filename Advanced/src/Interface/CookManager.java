package Interface;

public class CookManager {

	ICook icook; // 인터페이스가 지정해준 상수나 메서드를 참조할 수도 있고, 참조하지 않아도 된다.
				 // 명시를 해줌으로써 필요시 인터페이스에서 선언된 값들을 가져다 쓸 수 있으니 없는것보단 좋다고 판단.

	// 인터페이스가 지정해준 상수를 사용할 수도, 하지 않을 수도 있다.
	// 마찬가지로 실체화한 클래스들을 참조할 수도, 하지 않을 수도 있다.
	// 생성자처럼 보일수 있지만, 인터페이스는 생성자는 사용 불가!
	// 반면, 추상클래스는 생성자 사용 가능! 추상메서드가 아니다!
	public CookManager(ICook icook) {
		if(icook instanceof KoreanCook) {
			this.icook = (KoreanCook)icook;
		}else {
			this.icook = (ChineseCook)icook;
		}
	}

	public void setIcook(ICook icook) {
		this.icook = icook;
	}

	public void orderRice() {
		icook.makeRice();
	}

	public void orderSoup() {
		icook.makeSoup();
	}
}
