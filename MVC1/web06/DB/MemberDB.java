package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDB {

	public ArrayList<MemberVO> list() throws Exception { // 반환값
		
		ArrayList<MemberVO> list = new ArrayList<>(); // 받아서 사용할 bag 선언을 위한 list.
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ResultSet rs = ps.executeQuery(); // ResultSet : 모든 데이터 덩어리.
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
		
		while (rs.next()) { // rs.next() : true이면 있다라는 이야기, 만약 결과가 있다면 테이블에서 원하는 데이터항목을 꺼내주면 된다.
			// 꺼낼 때는 column항목별로 가지고 온다. 데이터 11개, column 4개면 처음 : 데이터 1번 column 1,2,3,4 번항목 다 가져온다.
			// 또 true 이면 데이터 2번 항목의 1~4번 column 항목 값을 가져온다.
			// 항목 1 행씩 내려간다.
			// rs.next()를 호출할 때마다 한 행씩 내려가서 그 행이 있는지를 체크 : boolean
			// 있으면 true, 없으면 false
			// true이면 각 항목의 값들을 꺼내주어야 한다.
			// 꺼내주는 방법은 2가지) 1. 항목명, 2. 항목의 인덱스
				
			String id2 = rs.getString("id");
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			// 가방을 만들어서 꺼내준 값들을 가방에 넣는다.
			MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			// 가방들을 넣어줄 컨테이너에 하나씩 넣어준다.
			list.add(bag);
		}
		return list;
	}

}