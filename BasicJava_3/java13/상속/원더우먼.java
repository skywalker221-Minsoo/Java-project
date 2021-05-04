package 상속;

public class 원더우먼 extends 우먼 {
	boolean fly;
	
	public void 하늘을날다() {
		System.out.println("이름이 " + name + "가 하늘을 날다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", fight=" + fight + ", name=" + name + ", age=" + age + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
