package 스태틱;

import javax.swing.JOptionPane;

public class 스태틱메서드사용 {

	public static void main(String[] args) {
		// 자바전체에서 아주 많이 사용되는 기능을 사용하고자 하는 경우
		// new를 사용해서 객체를 생성한 후에 메서드를 사용하면
		// 인스턴스변수들 모두 복사가 되고, 참조형 변수가 생성되는 등
		// 그 기능을 쓰기 위해서 너무 많은 불필요한 작업들이 이루어진다.
		// static메서드로 만들어놓으면, 객체생성하지 않아도
		// 바로 클래스이름으로만 그 기능을 쓸 수 있다.
		String s = "100";
		int n = Integer.parseInt(s);
		
		String s2 = JOptionPane.showInputDialog("숫자입력");
		int n2 = Integer.parseInt(s2);
		System.exit(0);

	}

}
