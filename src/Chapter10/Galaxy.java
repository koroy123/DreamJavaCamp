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
		System.out.println("Galaxy : " + "보조배터리 "+ time + "분 충전");
	}


	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "앱을 " + price + "원에 구입했습니다.");
		
		
	}

}
