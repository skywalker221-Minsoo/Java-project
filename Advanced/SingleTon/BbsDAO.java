package SingleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BbsDAO {
	
	Connection con; //¼±¾ð, Å¸ÀÔ º¯¼ö¸í;
	DBConnectionMgr dbcp; //½Ì±ÛÅæ °´Ã¼¸¦ È®ÀÎÇÏ±â À§ÇÑ ¸â¹öº¯¼ö ¼±¾ð
	
	public BbsDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance(); //½Ì±ÛÅæ °´Ã¼
	}
		

	public BbsVO read(String no) throws Exception {
		con = dbcp.getConnection(); //½Ì±ÛÅæ °´Ã¼¿¡ µå¶óÀÌ¹ö ¿¬°á
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, no);
		System.out.println("3. sql¹® °´Ã¼·Î »ý¼º ok");
		
		ResultSet result = ps.executeQuery();
		System.out.println("4. sql¹® mysql·Î Àü¼Û ok");
		
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


