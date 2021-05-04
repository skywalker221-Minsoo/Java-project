package 클래스만들기;

public class 계좌 {
	public String name = "김구";
	public String withdraw = "한국은행";
	public int money = 100000;

	public void 출금하다(int money) {
		System.out.println("출금금액 : " + money);
	}

	public void 예금하다(String name, String withdraw, int money) {
		System.out.println("이름 : " + name + "통장종류 : " + withdraw + "금액 : " + money);
	}


	public void 예금하다(String name, int money) {
		System.out.println("이름 : " + name + "금액 : " + money);
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", withdraw=" + withdraw + ", money=" + money + "]";
	}
	

}
