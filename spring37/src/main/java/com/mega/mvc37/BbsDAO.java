package com.mega.mvc37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //BbsDAO dao = new BbsDAO(); �̰� �ѹ��� �� �ϰ� ���ִ� ��ġ, �Ѱ��� ��ü ����, �̱���!
public class BbsDAO {
	
	
	@Autowired
	SqlSessionTemplate my;
	
	
	public void create(BbsVO bag) throws Exception {
		my.insert("bbs.insert", bag);
	}
		
		/*
		 * System.out.println("���޹��� ���濡 ����ִ� ������ db�� �ִ� ó�� �ϸ� ��."); //1.Ŀ���� ����ϰڴٰ�
		 * �����ؾ���. System.out.println("===============" + bag.getId());
		 * Class.forName("oracle.jdbc.OracleDriver");
		 * System.out.println("1. Ŀ���� ��� ���� ����. <br>");
		 * 
		 * //2. db�����غ���! - shop, root, 1234 String url =
		 * "jdbc:oracle:thin:@localhost:1521:xe";
		 * 
		 * Connection con = DriverManager.getConnection(url, "root", "1234");
		 * System.out.println("2. db���� �Ϸ�.");
		 * 
		 * //3.sql�� ��ü�� ����� String sql = "insert into bbs values (?, ?, ?, ?)";
		 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
		 * bag.getId()); ps.setString(2, bag.getTitle()); ps.setString(3,
		 * bag.getContent()); ps.setString(4, bag.getWriter());
		 * System.out.println("3. SQL���� ����� ����. <br>");
		 * 
		 * //4.SQL���� MySQL ������ ������. ps.executeUpdate(); con.commit(); con.close();
		 * System.out.println("4. SQL���� MySQL������ ���� ����. <br>");
		 */
	
	/*
	 * public void delete(BbsVO bag) throws Exception {
	 * System.out.println("���޹��� ���濡 ����ִ� ������ db�� �ִ� ó�� �ϸ� ��."); //1.Ŀ���� ����ϰڴٰ�
	 * �����ؾ���. System.out.println("===============" + bag.getId());
	 * Class.forName("oracle.jdbc.OracleDriver");
	 * System.out.println("1. Ŀ���� ��� ���� ����. <br>");
	 * 
	 * //2. db�����غ���! - shop, root, 1234 String url =
	 * "jdbc:oracle:thin:@localhost:1521:xe";
	 * 
	 * Connection con = DriverManager.getConnection(url, "root", "1234");
	 * System.out.println("2. db���� �Ϸ�.");
	 * 
	 * //3.sql�� ��ü�� ����� String sql = "delete from bbs where id = ?";
	 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
	 * bag.getId());
	 * 
	 * System.out.println("3. SQL���� ���� ����. <br>");
	 * 
	 * //4.SQL���� MySQL ������ ������. ps.executeUpdate(); con.commit(); con.close();
	 * System.out.println("4. SQL���� Oracle ������ ���� ����. <br>"); }
	 */
}
