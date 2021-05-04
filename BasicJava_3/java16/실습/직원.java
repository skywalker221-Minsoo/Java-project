package 실습;

public class 직원 {
	
	String name;
	int age;
	String phone;
	
	public 직원(String name, int age, String phone) {
	super();
	this.name = name;
	this.age = age;
	this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
}


