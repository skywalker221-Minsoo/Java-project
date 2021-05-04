package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDB {
	// CRUD 기능
	public void create(MemberVO bag) throws Exception {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		// 2. db연결해보자!
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import : 클릭 후, Ctrl + Shift + m
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");
		// 3. SQL문을 만든다.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)"; // 입력변수에 따옴표 쓰면 스트링의 기능일 뿐 연사자의 기능을 못한다!!!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getID());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		// 4. SQL문을 mySQL 서버로 전송함.
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}
	
	public MemberVO read(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
		
		MemberVO bag = new MemberVO();
		if (rs.next()) { // true이면 있다라는 이야기, 만약 결과가 있다면 테이블에서 원하는 데이터항목을 꺼내주면 된다.
		// 꺼내주는 방법은 2가지) 1. 항목명, 2. 항목의 인덱스
			String id2 = rs.getString("id");
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			bag.setID(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;
	}
	
	public void update(MemberVO bag) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db연결 성공. <br>");
		
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getTel());
		ps.setString(3, bag.getID()); // 물음표 순서대로 번호 부여
		System.out.println("3. SQL문을 만들기 성공. <br>");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}

	public void delete(String id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";

		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문을 만들기 성공. <br>");

		ps.executeUpdate();
		System.out.println("4. SQL문 mySQL서버로 전송 성공. <br>");
	}

}
