package Chapter10;

public class Truck extends Car{
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public void go(int d) {
		System.out.println("Ʈ���� Ÿ�� " + d + "Km �̵��մϴ�.");
	}
	
}