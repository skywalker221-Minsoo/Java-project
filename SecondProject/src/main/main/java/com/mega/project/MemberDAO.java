package com.mega.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //MemberDAO dao = new MemberDAO(); �̰� �ѹ��� �� �ϰ� ���ִ� ��ġ, �Ѱ��� ��ü ����, �̱���!
public class MemberDAO {
	
	//myBatis �̱��� �ּҸ� ����!
	@Autowired
	SqlSessionTemplate my;
	
	public List<MemberVO> all() {
		return my.selectList("member.all");
	}
	
	public void create(MemberVO bag) throws Exception {
		//myBatis�� ��ų �ſ���.
		my.insert("member.insert", bag);
	}
	
	public MemberVO read(MemberVO bag) {
		return my.selectOne("member.select", bag);
	}
	
	public MemberVO login(MemberVO bag) {
		return my.selectOne("member.login", bag);
	}
	
	public List<MemberVO> all2(){
		return my.selectList("member.all2");
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
		 * //3.sql�� ��ü�� ����� String sql = "insert into MEMBER values (?, ?, ?, ?)";
		 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
		 * bag.getId()); ps.setString(2, bag.getPw()); ps.setString(3, bag.getName());
		 * ps.setString(4, bag.getTel()); System.out.println("3. SQL���� ����� ����. <br>");
		 * 
		 * //4.SQL���� MySQL ������ ������. ps.executeUpdate(); con.commit(); con.close();
		 * System.out.println("4. SQL���� MySQL������ ���� ����. <br>");
		 */
	
	/*
	 * public void delete(MemberVO bag) throws Exception {
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
	 * //3.sql�� ��ü�� ����� String sql = "delete from MEMBER where id = ?";
	 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
	 * bag.getId());
	 * 
	 * System.out.println("3. SQL���� ���� ����. <br>");
	 * 
	 * //4.SQL���� MySQL ������ ������. ps.executeUpdate(); con.commit(); con.close();
	 * System.out.println("4. SQL���� Oracle ������ ���� ����. <br>"); }
	 */
}
