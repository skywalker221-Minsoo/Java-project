package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDAO {

	public void create(String id, String title, String story, String company) throws Exception {
		// mySQL�� ��ϵ� ���̺��� ���� �Է�(Insert)
		Class.forName("com.mysql.jdbc.Driver"); // mySQL ����
		String url = "jdbc:mysql://localhost:3306/mega"; // port��ȣ �� DB ��� �Է�
		
		Connection con = DriverManager.getConnection(url, "root", "1234"); // mySQL�� �����ϱ� ���� ID,PW�Է�
		
		String sql = "insert into book values (?, ?, ?, ?)"; // insert into ������ �̿��� ���� �Է�
		PreparedStatement ps = con.prepareStatement(sql); // �Ű����� �Է�
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, story);
		ps.setString(4, company); // ? �ڸ� ���� ���̺� ������ ����Ͽ� �� �Ű����� ����
		
		ps.executeUpdate(); // �Ű����� �Է� �� sql���� ����
		System.out.println("Create �Ϸ�. <br>"); // ���� �Ϸ� ���� Ȯ��.
	}

	public void delete(String id) throws Exception {
		// mySQL�� ��ϵ� ���̺� ���� ���� �Է�(Delete)
		Class.forName("com.mysql.jdbc.Driver"); // mySQL ����
		String url = "jdbc:mysql://localhost:3306/mega"; // port��ȣ �� DB ��� �Է�

		Connection con = DriverManager.getConnection(url, "root", "1234"); // mySQL�� �����ϱ� ���� ID,PW�Է�

		String sql = "delete from book where id = ?"; // delete ������ �̿��� ���� �Է�
		PreparedStatement ps = con.prepareStatement(sql); // �Ű����� �Է�
		ps.setString(1, id); // where�� ������ �̿��Ͽ� id�� �Է��ϸ� row ������ �ǵ��� ��.

		ps.executeUpdate(); // �Ű����� �Է� �� sql���� ����
		System.out.println("Delete �Ϸ�. <br>"); // ���� �Ϸ� ���� Ȯ��.
	}

}
