package 생성자;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//�옄諛붿뿉�꽌�뒗 �옄�룞 import 而⑦듃濡�+�돩�봽�듃+o(�삤)
public class MemberDB {
	
	//공통된 코드가 보임,
	//객체생성시 반드시 해주어야하는 작업!!!
	//이건 자동으로 만들어진다..
	//1. 클래스이름과 동일한 메서드가 객체생성시 자동호출
	//2. 프로그래머가 클래스 이름과 동일한 메서드가 자동으로 만들어진다.(메서드가 비어있음)
	//3. 객체생성시 클래스이름과 동일한 메서드로 자동호출되는 메서드를 "생성자"메서드라고 부른다. "생성자"라고도부름.
	//   객체생성시 자동호출되는 메서드라고 해서 생성자메서드!!(생성자 : constructor)
	Connection con; //변수 선언된 위치가 중요, 선언된 위치안에서만 사용 가능!
	
	public MemberDB() throws Exception{
		// 1. 而ㅻ꽖�꽣 �궗�슜�븯寃좊떎怨� �꽕�젙�빐�빞�븿.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 而ㅻ꽖�꽣 �궗�슜 �꽕�젙 �꽦怨�. <br>");

		// 2. db�뿰寃고빐蹂댁옄!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp�뿉�꽌�쓽 �옄�룞 import: �겢由� �썑, 而⑦듃濡�+�돩�봽�듃+m
		con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db�뿰寃� �꽦怨�. <br>");
	} 
	
	public ArrayList<MemberVO> list() throws Exception  {
		
		ArrayList<MemberVO> list = new ArrayList<>();
		
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
		
		//1. 寃��깋寃곌낵媛� �엳�뒗吏� 泥댄겕�빐�빞�븳�떎.
		//System.out.println(rs.next());//true�씠硫� �엳�떎�씪�뒗 �뼐湲�
		//2. 留뚯빟�뿉 寃곌낵媛� �엳�쑝硫�, �뀒�씠釉붿뿉�꽌 �썝�븯�뒗 �뜲�씠�꽣�빆紐⑹쓣 爰쇰궡二쇰㈃ �맖.
		while (rs.next()) {
			//rs.next()瑜� �샇異쒗븷 �븣留덈떎 �븳 �뻾�뵫 �궡�젮媛��꽌 洹� �뻾�씠 �엳�뒗吏�瑜� 泥댄겕: boolean
			//�엳�쑝硫� true, �뾾�쑝硫� false
			//true�씠硫� 媛� �빆紐⑹쓽 媛믩뱾�쓣 爰쇰궡二쇱뼱�빞 �븳�떎.
			//爰쇰궡二쇰뒗 諛⑸쾿�� 2媛�吏�, 1)�빆紐⑸챸, 2)�빆紐⑹쓽 �씤�뜳�뒪
			String id2 = rs.getString("id");//"apple"
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			//媛�諛⑹쓣 留뚮뱾�뼱�꽌 爰쇰궡以� 媛믩뱾�쓣 媛�諛⑹뿉 �꽔�뒗�떎.
			MemberVO bag = new MemberVO();
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			
			//媛�諛⑸뱾�쓣 �꽔�뼱以� 而⑦뀒�씠�꼫�뿉 �븯�굹�뵫 �꽔�뼱以��떎.
			list.add(bag);
		}
		System.out.println(list.size() + "================");
		
		return list;
	}
	
	public boolean check(String id, String pw) throws Exception  {

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
		
		boolean result = false;
		
		if (rs.next()) {
			result = true;
		}
		System.out.println(result);
		return result;
	}
	
	// crud湲곕뒫
	public int create(MemberVO bag) throws Exception  {

		// 3. SQL臾몄쓣 留뚮뱺�떎.=> �빐�떦�쓣 �뜥�꽌 SQL�쑝濡� �씤�떇�븯寃� �빐�빞�븿.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		int result = ps.executeUpdate();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
		return result;
	}
	
	public void update(MemberVO bag) throws Exception  {
		
		// 3. SQL臾몄쓣 留뚮뱺�떎.=> �빐�떦�쓣 �뜥�꽌 SQL�쑝濡� �씤�떇�븯寃� �빐�빞�븿.
		// String url = "http://www.naver.com";
		// URL url = new URL("http://www.naver.com")l
		// String file = "test.hwp";
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getTel());
		ps.setString(3, bag.getId());
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");
		
		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ps.executeUpdate();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
	}
	
	public void delete(String id) throws Exception  {

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ps.executeUpdate();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
	}

	public MemberVO read(String id) throws Exception  {

		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
		
		//1. 寃��깋寃곌낵媛� �엳�뒗吏� 泥댄겕�빐�빞�븳�떎.
		//System.out.println(rs.next());//true�씠硫� �엳�떎�씪�뒗 �뼐湲�
		//2. 留뚯빟�뿉 寃곌낵媛� �엳�쑝硫�, �뀒�씠釉붿뿉�꽌 �썝�븯�뒗 �뜲�씠�꽣�빆紐⑹쓣 爰쇰궡二쇰㈃ �맖.
		MemberVO bag = new MemberVO();
		if (rs.next()) {
			//爰쇰궡二쇰뒗 諛⑸쾿�� 2媛�吏�, 1)�빆紐⑸챸, 2)�빆紐⑹쓽 �씤�뜳�뒪
			String id2 = rs.getString("id");//"apple"
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;
	}
	
	public int read(String id, String pw) throws Exception  {

		int result = 0;

		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL臾몄쓣 留뚮뱾湲� �꽦怨�. <br>");

		// 4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚�븿.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL臾몄쓣 mySQL�꽌踰꾨줈 �쟾�넚 �꽦怨�. <br>");
		
		//1. 寃��깋寃곌낵媛� �엳�뒗吏� 泥댄겕�빐�빞�븳�떎.
		//System.out.println(rs.next());//true�씠硫� �엳�떎�씪�뒗 �뼐湲�
		//2. 留뚯빟�뿉 寃곌낵媛� �엳�쑝硫�, �뀒�씠釉붿뿉�꽌 �썝�븯�뒗 �뜲�씠�꽣�빆紐⑹쓣 爰쇰궡二쇰㈃ �맖.
		if (rs.next()) {
			result = 1;
		}
		//System.out.println(list2.size()); //11!
		return result;
	}

}
