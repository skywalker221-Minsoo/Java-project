package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDB {
	
	public void create(String id, String title, String content, String writer) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");
		
		String sql = "insert into board values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}

	
	public BoardVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
		
		BoardVO bag = new BoardVO();
		if (rs.next()) { // true이면 있다라는 이야기, 만약 결과가 있다면 테이블에서 원하는 데이터항목을 꺼내주면 된다.
						 // 꺼내주는 방법은 2가지) 1. 항목명, 2. 항목의 인덱스
			String id2 = rs.getString("id"); // jsp에서 id만 입력변수로 받아줬으니까 문자열을 사용을 id만 가능하다. 
			String title = rs.getString(2);
			String content = rs.getString(3);
			String writer = rs.getString(4);
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
		}
		return bag;
	}

	public void update(BoardVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "update board set title = ?, content = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getTitle());
		ps.setString(2, bag.getContent());
		ps.setString(3, bag.getWriter());
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문을 만들기 성공. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}

}
