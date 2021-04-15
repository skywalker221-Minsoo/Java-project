package java09;

public class Phone {
	String com;
	String color;
	String name;
	String text;
	String when;
	String inter;
	int size;
	int time;
	
	public void made() {
		if (com.equals("삼성")) {
			System.out.println("제조사는 삼성입니다.");
		}
		else
			System.out.println("제조사는 애플입니다.");
	}
	
	public void num() {
		System.out.println("전화번호는 010으로 시작됩니다.");
	}
	
	public void text(String name, String text, int size) {
		System.out.println("받는 사람 : " + name);
		System.out.println("보내는 메시지 : " + text);
		System.out.println("크기 : " + size);
		System.out.println("전화기로 문자하다.");
	}
	
	public void internet(String inter, String when, int time) {
		System.out.println(inter + "를 " + when + " " + time + "시간 사용했다.");
		System.out.println("전화기로 인터넷하다.");
	}
}
