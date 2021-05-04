package 복습;

public class Phone {

	String color;
	int size;
	
	public Phone(String color, int size) {
		//this : 해당 클래스를 의미
		//this.color : 해당 클래스 밑에 바로 선언된 color라는 의미
		//this로 전역변수를 지정할수 있다.
		//변수명이 전역/지역이 동일할 때 전역변수를 지정할 목적으로 사용
		super();
		this.color = color;
		this.size = size;
	}

	public void internet() {
		System.out.println("인터넷하다.");
	}

	public void text() {
		System.out.println("문자하다.");
	}

	@Override //재정의
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
