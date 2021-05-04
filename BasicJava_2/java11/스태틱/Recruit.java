package ½ºÅÂÆ½;

public class Recruit {
	String name;
	String sex;
	int age;
	static int sum;
	static int count;
	
	public Recruit(String name, String sex, int age) {
		super();
		sum = sum + age;
		this.name = name;
		this.sex = sex;
		this.age = age;
		count++;
	}

	public static void getAvg() {
		System.out.println(sum / (double)count);
	}

	@Override
	public String toString() {
		return "recruit [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
