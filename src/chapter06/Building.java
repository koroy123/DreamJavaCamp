package chapter06;

public class Building {
	public String name;
	public String address;
	public int totalFloor;
	
	public void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}

}
