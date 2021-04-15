package 다른패키지;

import 상속.Employee;

public class 과장 extends Employee {
	
	public void print() {
		System.out.println(name + " " + salary); // 상속받는 클래스에서 변수 가져올수 있다.
												 // default(안쓰는거), private 제외
	}
}
