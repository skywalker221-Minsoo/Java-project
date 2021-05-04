package 스태틱;

public class Day {
	//멤버변수는 객체생성 될 때마다 동적으로 메모리가 할당됨.
	//객체가 3개 생성되었다면, 객체마다 각각 다른 속성값들을 가져야 한다.
	//실제로 그 객체에 해당하는 실제값들이 구체적으로 저장되는 특징
	//실제값 : instance(인스턴스), dynamic이라고는 안한다.
	//객체생성할 때마다 복사되는 변수 : 인스턴스 변수
	String hobby;
	int hour;
	String Destination;
	//Static 변수는 클래스당 한개만 가지고 있는 변수!(고유번호 같은 느낌)
	//클래스이름.변수명
	//객체생성과는 상관이 없다.
	//static은 객체생성하지 않아도 사용 가능
	static int count; //전역변수, 0으로 초기화, 객체생성될 때 복사되지 않는 변수(이전값 그대로 가져간다. 초기화안됌!!)
	static int sum;
	
	//변수의 종류
	//저장되는 데이터 : 기본형(원시형 primitive), 참조형(referenced, derived)
	//사용할 수 있는 영역 : 전역, 지역
	//객체생성시 복사 여부 : 인스턴스, 스태틱
	
	
	
	public Day(String hobby, int hour, String destination) {
		super();
		sum = sum + hour;
		this.hobby = hobby;
		this.hour = hour;
		Destination = destination;
		count++;
	}

	@Override
	public String toString() {
		return "Day [hobby=" + hobby + ", hour=" + hour + ", Destination=" + Destination + "]";
	}
	
}
