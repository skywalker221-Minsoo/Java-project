package crawling;

import java.sql.*;

public class insert {

	public void insertQuery(int day, String title, String url, String thumb) {
		connection conn = new connection();
		PreparedStatement ps = null;

		try {
			// Insert문 ? 부분은 아래의 입력값이 자동으로 변환이 됩니다.
			String sql = "insert into name (no, day, title, url, thumb) values (0, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			
			int index = 1;
			ps.setInt(index++, day);
			ps.setString(index++, title);
			ps.setString(index++, url);
			ps.setString(index++, thumb);

			// SQL 실행
			int count = ps.executeUpdate();

			if (count == 0) {
				System.out.println("데이터값에 이상이 있습니다.");
			} else {
				System.out.println("데이터 Insert 성공!");
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다2.");
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}