package 예외처리;

public class 에러발생3 {

	public void call() throws Exception {
		//예외가 발생하면 메서드가 정의된 곳에서 처리하는 것이 아니라
		//메서드를 호출한 곳으로 예외처리를 떠넘길 수 있다.
		System.out.println(3 / 0);
	}
}
