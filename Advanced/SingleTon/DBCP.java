package SingleTon;

public class DBCP {
	static DBCP instance;
	//��ü�����Ǳ� ���� Ŭ�����̸����� Ư���� ��ü�� ����ϴ� ���
	//�ܺο��� DBCP��ü�� ����� ����. �����ڸ� �ܺ� Ŭ�������� ������ �� ������
	//private�� �������� ����
	//static�� ���Ͽ� �ٸ� ��ü�� ������� ������ ������� ��ü�� �����ϰ� �ȴ�.
	
	private DBCP() {
		
	}
	
	public static DBCP getInstance() {
		//DBCP��ü�� ������������� �װ��� return
		//DBCP��ü�� ����������� ������ �װ���
		//��ü�� ���� return
		if (instance == null) {
			instance = new DBCP();
		}
		return instance;
	}
}
