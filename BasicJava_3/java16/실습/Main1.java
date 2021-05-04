package ½Ç½À;

public class Main1 {

	public static void main(String[] args) {
		Car c = new Car();
		c.model = "Avante";
		c.velocity = 120;
		System.out.println(c);
		c.repair();
		c.run();
		System.out.println(c.model + ", " + c.velocity);
		
		Sedan a = new Sedan();
		a.color = "black";
		a.velocity = 120;
		a.model = "Sonata";
		a.Wash();
		a.repair();
		a.run();
		System.out.println(a.color + ", " + a.model + ", " + a.velocity);
		
		Truck t = new Truck();
		t.model = "Porter";
		t.velocity = 80;
		t.num = 4885;
		t.Sign();
		System.out.println(t.model + ", " + t.num + ", " + t.velocity);

	}

}
