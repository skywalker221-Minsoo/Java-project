package 실습;

public class Main2 {

	public static void main(String[] args) {
		
		Me m = new Me();
		m.age = 28;
		m.day();
		
		Father f = new Father();
		f.age = 58;
		f.hobby = "사우나";
		f.father();
		
		Mother o = new Mother();
		o.age = 58;
		o.work = "설거지";
		o.day();
		o.Smash();
		
		System.out.println(m.age + ", " + f.age + ", " + f.hobby + ", " + o.age + ", " + o.work);

	}

}
