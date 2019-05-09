package Chapter07;

public class Magazine {
	private int price;
	
	public void setprice(int price) {
		this.price = price;
	}
	
	int disCountPrice(int rate) {
		return (int)price * (100 - rate) / 100;
	}

}
