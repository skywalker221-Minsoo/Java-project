package 클래스만들기;

public class 강아지 {
	// 멤버변수 => 성질
	public String color; // 참조형은 무조건 null로 초기화
	public int size1; // 기본형은 0으로 초기화
	public int size2;
	public String type;
	
	// 멤버메서드 => 동작
	public void bite() {
		System.out.println("물어");
	}
	
	public void yall() {
		System.out.println("짖어");
	}
	
	public void laydown() {
		System.out.println("누워");
	}
	
	public void walk() {
		System.out.println("다녀");
	}
}
