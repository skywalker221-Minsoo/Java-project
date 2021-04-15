package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MovieDB {
	// CRUD 기능
	public void create(String id, String title, String genre, String fee, String birth, String picture, String story) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		String url = "jdbc:mysql://localhost:3306/movie";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");
		String sql = "insert into content values (?, ?, ?, ?, ?, ?, ?)"; // 입력변수에 따옴표 쓰면 스트링의 기능일 뿐 연사자의 기능을 못한다!!!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, genre);
		ps.setString(4, fee);
		ps.setString(5, birth);
		ps.setString(6, picture);
		ps.setString(7, story);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}

}