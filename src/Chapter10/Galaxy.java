package Chapter10;

public class Galaxy extends Mobile implements Gooplay{
	private String osVersion;

	public Galaxy(String production) {
		super(production);
	}
	
	
	public String getOsVersion() {
		return osVersion;
	}


	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}


	public void charge(int time) {
		System.out.println("Galaxy : " + "�������͸� "+ time + "�� ����");
	}


	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "���� " + price + "���� �����߽��ϴ�.");
		
		
	}

}
