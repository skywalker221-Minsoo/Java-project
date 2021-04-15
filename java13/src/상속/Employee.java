package 상속;

public class Employee {
	public String name;
	String address;
	protected int salary;
	protected int rrn;
	
	private void al() {
		System.out.println("우리회사만의 알고리즘.");
	}
	@Override
	public String toString() {
		al();
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
