package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 배열심화연습 {

	public static void main(String[] args) {
		String[] trip = new String[3];
		String[] trip2 = new String[3];
		
//		Scanner sc = new Scanner(System.in); // 스트링 크기 먼저 선언하고서는 안되네...
//		System.out.println("작년에 가고 싶었던 곳은? ");
//		trip = sc.next();
		for (int i = 0; i < trip.length; i++) {
			trip[i] = JOptionPane.showInputDialog("올해 가고싶은 곳은? ");
			trip2[i] = JOptionPane.showInputDialog("작년에 가고싶었던 곳은? ");
		}
		for (int i = 0; i < trip.length; i++) {
			System.out.println(trip[i] + " " + trip2[i]);
		}
		int count = 0;
		for (int i = 0; i < trip.length; i++) {
			if (trip[i].equals(trip2[i])) {
				count++;
				System.out.println("일치하는 곳은 " + i);
			}
		}
		System.out.println("일치하는 갯수는 " + count);
	}
}
