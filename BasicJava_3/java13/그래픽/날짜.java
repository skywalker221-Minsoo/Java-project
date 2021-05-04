package 그래픽;

import java.util.Date;

import javax.swing.JLabel;

public class 날짜 extends Thread {
	JLabel day;
	
	public 날짜(JLabel day) {
		this.day = day;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			day.setText("날짜 : " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
