package chapter06;

public class Car {
	String carName;
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
		oilAmount += amount;
		System.out.println("휘발유를" + amount + "L 주유합니다.");
	}
	
	void priceCarInfo() {
		System.out.println("[" + carName + "] 남은 기름양 : " + oilAmount + "L, 총 주행거리 : " + distance + " Km");
	}
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "에서" + endPoint + "까지" + driveDistance + "Km 주행하였습니다.");
		distance += driveDistance;
		oilAmount -=(int)(driveDistance / 20);
	}
	void distanceCheck() {
		System.out.println("주행가능 거리는 약" + (oilAmount * 20) + "Km입니다.");
	}

}
