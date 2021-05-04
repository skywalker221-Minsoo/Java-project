package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		try {
			//해당 폴더와 스트림(stream, 연결통로)을 만든다.
			//스트림의 특징은 한방향이다!
			FileWriter f = new FileWriter("c:/data/" + s1 + ".txt");
			//절대경로: 위치를 나타낼 때 맨앞에서부터 쭉 써주는 경로
			//상대경로: 현재 위치를 기준해서 상대적으로 써주는 경로
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); //stream으로 정보를 넘겨주고 나서는 반드시 닫아서 끝맺어주어야한다!!!
					   //stream을 다 쓰고 나서는 반드시 자원해제!!(같은말)
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러 정보는 " + e.getMessage());
		}
		
	}

}
