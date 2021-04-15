package 스레드;

public class 스레드3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("&");
		}
		System.out.println();
	}
}
