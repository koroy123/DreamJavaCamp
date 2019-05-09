package Chapter07;

public class Computer {
	String model;
	String osver;
	int producttion;
	int sales;
	public Computer(String model, String osver, int producttion) {
		this.model = model;
		this.osver = osver;
		this.producttion = producttion;
	}
	public Computer(String model, String osver, int producttion, int sales) {
		this.model = model;
		this.osver = osver;
		this.producttion = producttion;
		this.sales = sales;
	}
	
	void printComputerInfo() {
		System.out.println("===" + this.model +" (" + this.osver + ") ===");
		System.out.println("생산 : " + this.producttion + "/판매 :" + this.sales);
	}

}
