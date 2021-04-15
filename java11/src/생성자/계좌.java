package »ı¼ºÀÚ;

public class °èÁÂ {
	String name;
	String field;
	int money;
	//new °èÁÂ() => »ç¿ëºÒ°¡
	public °èÁÂ(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "°èÁÂ [name=" + name + ", field=" + field + ", money=" + money + "]";
	}

	
}
