package Chapter10;

public class IPhone extends Mobile{
	private String color;

	public IPhone(String production) {
		super(production);
	
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void charge(int time) {
		System.out.println("IPhone : " + time + "�� �����ߴ��� full!!");
	}

}
