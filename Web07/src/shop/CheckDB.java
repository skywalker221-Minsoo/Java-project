package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckDB {
	
	public boolean check(String id, String pw) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ResultSet rs = ps.executeQuery(); // row가 비어있는 항목만 있는 테이블에 return해준다.
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
		
		boolean result = false;
		
		if (rs.next()) {
			result = true;
		}
		return result;
	}

}