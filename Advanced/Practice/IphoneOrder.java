package Practice;

public class IphoneOrder{
	
	IphoneInterface IphoneInterface;

	public IphoneOrder(IphoneInterface IphoneInterface) {
		this.IphoneInterface = (IphoneUse)IphoneInterface;
	}

	public void OrderIphone() {
		System.out.println("�������� �ֹ��մϴ�.");
	}
}