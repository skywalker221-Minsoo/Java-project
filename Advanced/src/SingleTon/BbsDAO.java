package SingleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BbsDAO {
	
	Connection con; //선언, 타입 변수명;
	DBConnectionMgr dbcp; //싱글톤 객체를 확인하기 위한 멤버변수 선언
	
	public BbsDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance(); //싱글톤 객체
	}
		

	public BbsVO read(String no) throws Exception {
		con = dbcp.getConnection(); //싱글톤 객체에 드라이버 연결
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, no);
		System.out.println("3. sql문 객체로 생성 ok");
		
		ResultSet result = ps.executeQuery();
		System.out.println("4. sql문 mysql로 전송 ok");
		
		BbsVO bag = new BbsVO();
		if (result.next()) {
			String id2 = result.getString("no");
			String title = result.getString(2);
			String content = result.getString(3);
			String writer = result.getString(4);
			bag.setId(id2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			
			return bag;
		} else {
			return null;
		}
	}
}


