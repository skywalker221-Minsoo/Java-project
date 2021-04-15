package crawling;

import java.sql.*;

public class select {

	public int selectQuery(String title) {
		int result = 0;

		connection conn = new connection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Select 쿼리문
			String sql = "select count(*) from name where title = ?";
			ps = conn.prepareStatement(sql);
			
			int psIndex = 1;
			ps.setString(psIndex++, title);

			// SQL 실행
			rs = ps.executeQuery();

			// 결과값 출력
			while (rs.next()) {
				result = rs.getInt(1);
				break;
			}
		} catch (SQLException e) {
			System.out.println("Database 연결중 에러가 발생 했습니다3.");
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}