package ½Ç½À;

public class Main4 {
	
	public Main4() {
		Plus p = new Plus();
		Minus m = new Minus();
		m.start();
		p.start();
	}
	
	public static void main(String[] args) {
		Main4 m1 = new Main4();
	}
	
	public class Plus extends Thread{
		@Override
		public void run() {
			for (int i = 0; i <= 999; i++) {
				System.out.println(i);
			}
		}
	}
	
	public class Minus extends Thread{
		@Override
		public void run() {
			for (int i = 999; i >= 0; i--) {
				System.out.println(i);
			}
		}
	}
}
