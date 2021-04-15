package com.mega.mvc37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component //싱글톤 사용시 Autowired와 대응.
public class ProductDAO {
	
	public void create(ProductVO bag) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		
		String sql = "insert into product values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getPrice());
		ps.setString(4, bag.getCompany());
		
		ps.executeUpdate();
		con.commit();
		con.close();
		System.out.println("저장 완료.");
	}

}
