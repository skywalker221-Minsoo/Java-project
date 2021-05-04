package 그래픽;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 이미지 extends Thread {
	JLabel image;
	
	public 이미지(JLabel image) {
		this.image = image;
	}
	@Override
	public void run() {
		String[] list = {"다운로드1.jfif", "다운로드2.jfif", "다운로드3.jfif", "다운로드4.jfif", "다운로드5.jfif"};
		int i = 1;
		int pause = 0;
		while (i < list.length) {
			ImageIcon icon = new ImageIcon("다운로드" + i + ".jfif");
			image.setIcon(icon);
			try {
				//초를 설정할 때는 밀리초, 1/1000설정.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			i++;
			if (i == list.length) {
				//pause++;
				//i = 1;
				if(pause == 10) {
					break;
				}
			}
		}
	}
}
