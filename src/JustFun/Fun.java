package JustFun;

public class Fun {
	private int name;
	private int toll;
	
	public Fun(int name, int toll) {
		this.name = name;
		this.toll = toll;
	}

	public int getName() {
		return name;
	}

	public int getToll() {
		return toll;
	}
	
	void printIdolInfo() {
		System.out.println(" ¿Ã∏ß : " + this.getName() + " / " + " ≈∞ : " + this.getToll() + " cm");
	}
	

}
