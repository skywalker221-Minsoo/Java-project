package java09;

public class 계좌정보 {
	String name;
	String deposit_name;
	int money;
	// 자바에서 변수느 ㄴ언제 만들어지나요?
	// 타입 변수명; 이걸 선언 이라고 한다.
	// 선언의 변수가 사용할 수 있는 범위
	// 클래스 아래에서 선언된다!!!
	// 클래스 전역에서 사용 가능
	// 전역변수, 글로벌 변수
	// 전역변수는 자동초기화된다!!!
	
	
	
	public void withdraw(String withdraw) { // 여기다 멤버변수를 위에서 선언하지 않고 여기에 입력하면 바로 사용가능.
		System.out.print(name + "는  " + withdraw + "하다.");
	}
	
	public void deposit(String deposit) { // String deposit <- 위에 선언 안하고 바로 사용가능.
		System.out.print(name + "은 " + deposit + "하다.");
	}
	
}
