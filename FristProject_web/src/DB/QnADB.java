package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QnADB {

	public ArrayList<QnAVO> list() throws Exception { 
		
		ArrayList<QnAVO> list = new ArrayList<>();
		
	    Class.forName("com.mysql.jdbc.Driver");
	    

	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    
	    String sql = "select * from qna";
	    PreparedStatement ps = con.prepareStatement(sql);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    while (rs.next()) {

	    	int no = rs.getInt(1); 
	    	String type = rs.getString(2); 
	    	String title = rs.getString(3); 
	    	String content = rs.getString(4); 
	    	int views = rs.getInt(5); 
	    	
	    	QnAVO bag = new QnAVO();
			bag.setNo(no);
			bag.setType(type);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setViews(views);
			
			list.add(bag);
		}
	    return list;
	}
	
	public void create(QnAVO bag) throws Exception {
		
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");

	    String sql = "insert into qna(type, title, content) values(?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getType());
	    ps.setString(2, bag.getTitle());
	    ps.setString(3, bag.getContent());
	    
	    ps.executeUpdate();
	}
	
	public void delete(int no) throws Exception {

	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");

	    String sql = "delete from qna where no = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setInt(1, no);

	    ps.executeUpdate();
	}
	
	public void update(int no) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		//PrintWriter out = new //PrintWriter();
		
		String url = "jdbc:mysql://localhost:3306/movie";
		Connection con = DriverManager.getConnection(url, "root", "1234");

		String sql = "update qna set views = views + 1 where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		ps.executeUpdate();
	}
	
	public QnAVO read(int no) throws Exception {
	   
	    Class.forName("com.mysql.jdbc.Driver");
	    
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	   
	    String sql = "select * from qna where no = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setInt(1, no);

	    ResultSet rs = ps.executeQuery();

	    QnAVO bag = new QnAVO();
	    if (rs.next()) {

	    	int no1 = rs.getInt(1); 
	    	String type = rs.getString(2); 
	    	String title = rs.getString(3); 
	    	String content = rs.getString(4); 
	    	int views = rs.getInt(5); 
	    	
			bag.setNo(no1);
			bag.setType(type);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setViews(views);;
		}
	    return bag;
	}

}
