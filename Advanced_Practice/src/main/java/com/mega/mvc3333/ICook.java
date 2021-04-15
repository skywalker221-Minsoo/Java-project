package com.mega.mvc3333;

public interface ICook { //인털페이스의 시작. 좋습니다.
						 //목적: 동일한 목적을 위해 방법은 조금씩 달라도 최대한 동일한 기능을 보장하게 하기 위함.
						 //이유: 자바의 다형성(다중형태를 갖는 성질)을 이용, 코드의 수정을 최소화하고 유지보수가 용이하도록!!
						 //인터페이스는 일반 변수, 일반 클래스는 사용 불가!
	
	//(상수) 타입 상수명 = 값; 				상수: 인터페이스에서 값을 정해줄테니 함부로 바꾸지 말고 제공해주는 값만 참조해라.(final 붙으면 변경 불가)
	//(메서드) 타입 메서드명(매개변수)			추상메서드: 가이드를 줬으니 재구현해서 써라.(implements 안하면 쓰지 않아도 된다.)
	//(메서드) default 타입 메서드명(매개변수) 	디폴트메서드: 인터페이스에서 기본적으로 제공해주지만, 맘에 안들면 각자 다르게 구현해서 써도 좋다.
	//(메서드) static 타입 메서드명(매개변수)		정적메서드: 인터페이스에서 제공해주는 것으로 무조건 사용.
	
	//void 4개 : ICook이라는 목적을 달성하기 위해 알아서 재정의해서 사용.
	public void makeRice(); 
	public void makeSoup();
	public void makeSalad();
	public void makeSource();
	
}
