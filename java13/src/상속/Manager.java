package 상속;

public class Manager extends Employee {
	private int bonus = 100; //이 클래스에서만 변수 사용가능.
	
	public void test() {
		System.out.println(bonus + "만원 보너스 받으며 관리감독.");
	}
}
