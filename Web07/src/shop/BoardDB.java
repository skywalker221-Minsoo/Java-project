package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDB {

	public ArrayList<BoardVO> list() throws Exception {

		ArrayList<BoardVO> list = new ArrayList<>(); // bag들을 집어넣을 ArrayList 생성. 이때 Board 테이블의 column값들을 받아올 것이므로 VO를 사용한다.
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from board";
		PreparedStatement ps = con.prepareStatement(sql);

		System.out.println("3. SQL문을 만들기 성공. <br>");

		ResultSet rs = ps.executeQuery(); // row가 비어있는 항목만 있는 테이블에 return해준다.
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");

		while (rs.next()) {

			BoardVO bag = new BoardVO(); // bag을 통해서 각 row값들을 더미로 VO에 설정한 변수들에 저장시키겠다.
			String id2 = rs.getString("id");
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);

			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);

			list.add(bag); // bag 들을 ArrayList 안에 집어넣는다.
		}
		return list; // ArrayList로 반환받아 활용한다.
	}

}