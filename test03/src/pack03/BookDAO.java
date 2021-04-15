package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDAO {

	public void create(String id, String title, String story, String company) throws Exception {
		// mySQL에 등록된 테이블별로 정보 입력(Insert)
		Class.forName("com.mysql.jdbc.Driver"); // mySQL 연결
		String url = "jdbc:mysql://localhost:3306/mega"; // port번호 및 DB 경로 입력
		
		Connection con = DriverManager.getConnection(url, "root", "1234"); // mySQL에 접속하기 위한 ID,PW입력
		
		String sql = "insert into book values (?, ?, ?, ?)"; // insert into 구문을 이용한 정보 입력
		PreparedStatement ps = con.prepareStatement(sql); // 매개변수 입력
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, story);
		ps.setString(4, company); // ? 자리 별로 테이블 순서를 고려하여 각 매개변수 설정
		
		ps.executeUpdate(); // 매개변수 입력 후 sql구문 실행
		System.out.println("Create 완료. <br>"); // 정상 완료 여부 확인.
	}

	public void delete(String id) throws Exception {
		// mySQL에 등록된 테이블 삭제 정보 입력(Delete)
		Class.forName("com.mysql.jdbc.Driver"); // mySQL 연결
		String url = "jdbc:mysql://localhost:3306/mega"; // port번호 및 DB 경로 입력

		Connection con = DriverManager.getConnection(url, "root", "1234"); // mySQL에 접속하기 위한 ID,PW입력

		String sql = "delete from book where id = ?"; // delete 구문을 이용한 정보 입력
		PreparedStatement ps = con.prepareStatement(sql); // 매개변수 입력
		ps.setString(1, id); // where절 조건을 이용하여 id만 입력하면 row 삭제가 되도록 함.

		ps.executeUpdate(); // 매개변수 입력 후 sql구문 실행
		System.out.println("Delete 완료. <br>"); // 정상 완료 여부 확인.
	}

}
