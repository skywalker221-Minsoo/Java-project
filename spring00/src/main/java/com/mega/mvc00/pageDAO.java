package com.mega.mvc00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mega.mvc00.pageVO;

public class pageDAO {
	
	public pageVO read(String pid) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	 	
	    String url = "jdbc:oracle:thin:@localhost:1521:BIGAI";
	    Connection con = DriverManager.getConnection(url, "bigai", "1234");

	    String sql = "select * from bigai where pid = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	   	ps.setString(1, pid);
			
		ResultSet rs = ps.executeQuery();

		pageVO bag = new pageVO();
		if (rs.next()) {
			
			String id = rs.getString("pid");
			String name = rs.getString(2);
			String level2 = rs.getString(3);
			String work = rs.getString(4);
			String pay = rs.getString(5);
			String indate = rs.getString(6);
			
			bag.setPid(id);
			bag.setName(name);
			bag.setLevel2(level2);
			bag.setWork(work);
			bag.setPay(pay);
			bag.setIndate(indate);
			
		}
		return bag;
	}
	
}
