package SingleTon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BbsDAO {
	
	Connection con; //����, Ÿ�� ������;
	DBConnectionMgr dbcp; //�̱��� ��ü�� Ȯ���ϱ� ���� ������� ����
	
	public BbsDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance(); //�̱��� ��ü
	}
		

	public BbsVO read(String no) throws Exception {
		con = dbcp.getConnection(); //�̱��� ��ü�� ����̹� ����
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, no);
		System.out.println("3. sql�� ��ü�� ���� ok");
		
		ResultSet result = ps.executeQuery();
		System.out.println("4. sql�� mysql�� ���� ok");
		
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


