package SingleTon;

public class DBCP��� {

	public static void main(String[] args) throws Exception {
		//DBCP dbcp = new DBCP();
		DBCP dbcp1 = DBCP.getInstance();
		DBCP dbcp2 = DBCP.getInstance();
		System.out.println(dbcp1);
		System.out.println(dbcp2);
		
		BbsDAO dao = new BbsDAO();
		BbsDAO dao2 = new BbsDAO();
		BbsDAO dao3 = new BbsDAO();
		System.out.println(dao.dbcp);
		System.out.println(dao2.dbcp);
		System.out.println(dao3.dbcp);
		//dbcp = DBConnectionMgr.getInstance();�� �����صξ��� ������ �ֿܼ� ������ 6�� ���
		//���� �ּҰ��� ������ �� ����.
		DBConnectionMgr con1 = DBConnectionMgr.getInstance();
		DBConnectionMgr con2 = DBConnectionMgr.getInstance();
		DBConnectionMgr con3 = DBConnectionMgr.getInstance();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		
	}

}