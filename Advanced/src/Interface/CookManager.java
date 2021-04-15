package Interface;

public class CookManager {

	ICook icook; // �������̽��� �������� ����� �޼��带 ������ ���� �ְ�, �������� �ʾƵ� �ȴ�.
				 // ��ø� �������ν� �ʿ�� �������̽����� ����� ������ ������ �� �� ������ ���°ͺ��� ���ٰ� �Ǵ�.

	// �������̽��� �������� ����� ����� ����, ���� ���� ���� �ִ�.
	// ���������� ��üȭ�� Ŭ�������� ������ ����, ���� ���� ���� �ִ�.
	// ������ó�� ���ϼ� ������, �������̽��� �����ڴ� ��� �Ұ�!
	// �ݸ�, �߻�Ŭ������ ������ ��� ����! �߻�޼��尡 �ƴϴ�!
	public CookManager(ICook icook) {
		if(icook instanceof KoreanCook) {
			this.icook = (KoreanCook)icook;
		}else {
			this.icook = (ChineseCook)icook;
		}
	}

	public void setIcook(ICook icook) {
		this.icook = icook;
	}

	public void orderRice() {
		icook.makeRice();
	}

	public void orderSoup() {
		icook.makeSoup();
	}
}
