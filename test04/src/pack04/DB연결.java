package pack04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB���� {
	
	public static void main(String[] args) throws Exception {
		String id = "window";
		String pw = "window";
		String name = "window";
		String tel = "window";
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ��� ���� ����. <br>");

		String url = "jdbc:mysql://localhost:3306/test04";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db���� ����. <br>");
		
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		ps.executeUpdate();
		
		System.out.println("3. SQL���� ����� ����. <br>");
		
		System.out.println("4. SQL���� mySQL������ ���� ����. <br>");
	}

}
