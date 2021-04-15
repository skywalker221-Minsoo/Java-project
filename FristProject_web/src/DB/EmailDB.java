package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmailDB {
	//crud기능
	
	public ArrayList<EmailVO> list() throws Exception { 
		//return되는 타입 -> void 자리에 ArrayList<MemberVO>가져와서 복붙
		ArrayList<EmailVO> list = new ArrayList<>(); //전체를 담은 컨테이너 생성
		
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/movie";
	    //jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from board";
	    PreparedStatement ps = con.prepareStatement(sql);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    //1. 검색결과가 있는지 체크해야한다.
	    //System.out.println(rs.next());//true이면 있다라는 얘기
	    //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
	    while (rs.next()) {
	    	//rs.next()를 호출할 때마다 한 행씩 내려가서 그 행이 있는지를 체크: boolean
	    	//있으면 true, 없으면 false
	    	//true이면 각 항목의 값들을 꺼내주어야 한다.
	    	
	    	//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	    	
	    	String id = rs.getString(1); 
	    	String name = rs.getString(2); 
	    	String tel = rs.getString(3); 
	    	String email = rs.getString(4); 
	    	String type = rs.getString(5); 
	    	String title = rs.getString(6); 
	    	String content = rs.getString(7); 
	    	
	    	//가방을 만들어서 꺼내준 값들을 가방에 넣는다.
	    	EmailVO bag = new EmailVO();
	    	
	    	bag.setId(id);
	    	bag.setName(name);
			bag.setTel(tel);
			bag.setEmail(email);
			bag.setType(type);;
			bag.setTitle(title);
			bag.setContent(content);
			
			//가방들을 넣어줄 컨테이너에 하나씩 넣어준다.
			list.add(bag);
		}
	    return list; //list: 가방이 들어간 컨테이너 역할
	}
	
	public void create(EmailVO bag) throws Exception {
		System.out.println(bag.getId()+ "=======================================");
	    //1. 커넥터 사용
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결
	    String url = "jdbc:mysql://localhost:3306/movie"; 
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "insert into board(id, name, tel, email, type, title, content) values(?, ?, ?, ?, ?, ?, ?)";
	    PreparedStatement ps = con.prepareStatement(sql);	    
	    ps.setString(1, bag.getId());
	    ps.setString(2, bag.getName());
	    ps.setString(3, bag.getTel());
	    ps.setString(4, bag.getEmail());
	    ps.setString(5, bag.getType());
	    ps.setString(6, bag.getTitle());
	    ps.setString(7, bag.getContent());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public void delete(String id) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "delete from board where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	public void update(EmailVO bag) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    //PrintWriter out = new //PrintWriter();
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/movie";
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "update board set type = ?, email = ?, title = ?, content = ? where tel = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(5, bag.getTel());
	    ps.setString(2, bag.getEmail());
	    ps.setString(1, bag.getType());
	    ps.setString(3, bag.getTitle());
	    ps.setString(4, bag.getContent());
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ps.executeUpdate();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	}
	
	public EmailVO read(String id) throws Exception {
	    //1. 커넥터 사용하겠다고 설정해야함.
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1. 커넥터 사용 설정 성공. <br>");
	    
	    //2. db연결해보자! - shop, root, 1234
	    String url = "jdbc:mysql://localhost:3306/movie";//jsp에서의 자동 import: 컨트롤 + 쉬프트 + m
	    Connection con = DriverManager.getConnection(url, "root", "1234");
	    System.out.println("2. db연결 성공. <br>");
	    
	    //3. SQL문을 만든다. => 해당을 써서 SQL으로 인식하게 해야함.
	    //String url = "http:www.naver.com"; => url이 아니고 그냥 String으로 인식함
	    //URL url = new URL("http://www.naver.com");
	    //String file = "test.hwp"; => url 아니고 String으로 인식
	    String sql = "select * from board where id = ?";
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id);
	    System.out.println("3. SQL문을 만들기 성공. <br>");
	    
	    //4. SQL문을 mySQL서버로 전송함.
	    ResultSet rs = ps.executeQuery();
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	    
	    //1. 검색결과가 있는지 체크해야한다.
	    //System.out.println(rs.next());//true이면 있다라는 얘기
	    //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
	    EmailVO bag = new EmailVO();
	    if (rs.next()) {
	    	//꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	    	String id2 = rs.getString(1); 
	    	String name = rs.getString(2); 
	    	String tel1 = rs.getString(3); 
	    	String email = rs.getString(4); 
	    	String type = rs.getString(5); 
	    	String title = rs.getString(6); 
	    	String content = rs.getString(7); 
	    	bag.setId(id2);
	    	bag.setName(name);
			bag.setTel(tel1);
			bag.setEmail(email);
			bag.setType(type);
			bag.setTitle(title);
			bag.setContent(content);
		}
	    return bag;
	}

}
