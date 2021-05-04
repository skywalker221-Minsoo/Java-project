package com.mega.mvc39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //BbsDAO dao = new BbsDAO(); 이걸 한번만 딱 하게 해주는 장치, 한개만 객체 생성, 싱글톤 객체 생성!
public class BbsDAO {
	
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<BbsVO> all() {
		return my.selectList("bbs.all");
	}
	
	public void create(BbsVO bag) throws Exception { //VO는 프로토타입이라고 볼수 있다. set메서드를 해주므로.
		my.insert("bbs.insert", bag);
	}
	
	public BbsVO read(BbsVO bag){ //VO는 프로토타입이라고 볼수 있다. set메서드를 해주므로.
		BbsVO vo = my.selectOne("bbs.select", bag);
		return vo;
	}
		
		/*
		 * System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨."); //1.커넥터 사용하겠다고
		 * 설정해야함. System.out.println("===============" + bag.getId());
		 * Class.forName("oracle.jdbc.OracleDriver");
		 * System.out.println("1. 커넥터 사용 설정 성공. <br>");
		 * 
		 * //2. db연결해보자! - shop, root, 1234 String url =
		 * "jdbc:oracle:thin:@localhost:1521:xe";
		 * 
		 * Connection con = DriverManager.getConnection(url, "root", "1234");
		 * System.out.println("2. db연결 완료.");
		 * 
		 * //3.sql문 객체로 만들기 String sql = "insert into bbs values (?, ?, ?, ?)";
		 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
		 * bag.getId()); ps.setString(2, bag.getTitle()); ps.setString(3,
		 * bag.getContent()); ps.setString(4, bag.getWriter());
		 * System.out.println("3. SQL문을 만들기 성공. <br>");
		 * 
		 * //4.SQL문을 MySQL 서버로 전송함. ps.executeUpdate(); con.commit(); con.close();
		 * System.out.println("4. SQL문을 MySQL서버로 전송 성공. <br>");
		 */
	
	/*
	 * public void delete(BbsVO bag) throws Exception {
	 * System.out.println("전달받은 가방에 들어있는 데이터 db에 넣는 처리 하면 됨."); //1.커넥터 사용하겠다고
	 * 설정해야함. System.out.println("===============" + bag.getId());
	 * Class.forName("oracle.jdbc.OracleDriver");
	 * System.out.println("1. 커넥터 사용 설정 성공. <br>");
	 * 
	 * //2. db연결해보자! - shop, root, 1234 String url =
	 * "jdbc:oracle:thin:@localhost:1521:xe";
	 * 
	 * Connection con = DriverManager.getConnection(url, "root", "1234");
	 * System.out.println("2. db연결 완료.");
	 * 
	 * //3.sql문 객체로 만들기 String sql = "delete from bbs where id = ?";
	 * PreparedStatement ps = con.prepareStatement(sql); ps.setString(1,
	 * bag.getId());
	 * 
	 * System.out.println("3. SQL문을 제거 성공. <br>");
	 * 
	 * //4.SQL문을 MySQL 서버로 전송함. ps.executeUpdate(); con.commit(); con.close();
	 * System.out.println("4. SQL문을 Oracle 서버로 전송 성공. <br>"); }
	 */
}
